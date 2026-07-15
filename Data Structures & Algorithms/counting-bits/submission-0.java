class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i=0;i<=n;i++){
            arr[i] = count(i);
        }
        return arr;
    }

    private static int count(int n){
        int temp = 0;
        while(n>0){
            n &= (n-1);
            temp += 1;
        }

        return temp;
    }
}
