class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        for(i=a.length()-1,j=b.length()-1;i>=0 && j>=0;i--,j--){
            int bit_a = Integer.parseInt(a.charAt(i) + "");
            int bit_b = Integer.parseInt(b.charAt(j) + "");
            System.out.println(bit_a + " " + bit_b);
            int sum = bit_a + bit_b + carry;
            if(sum==3 || sum==2){
                carry = 1;
                if(sum==3) sb.append("1");
                else sb.append("0");
            }
            else if(sum==1){ sb.append("1");
             carry = 0;
            }
            else sb.append("0");
        }
        
            for(;i>=0;i--){
                int bit = Integer.parseInt(a.charAt(i) + "");
                int sum = bit + carry;
                if(sum==2) {
                    sb.append("0");
                    carry = 1;
                }
                else if(sum ==1) {
                    sb.append("1");
                    carry = 0;
                }
                else sb.append("0");
            }

        for(;j>=0;j--){
                int bit = Integer.parseInt(b.charAt(j) + "");
                int sum = bit + carry;
                if(sum==2) {
                    sb.append("0");
                    carry = 1;
                }
                else if(sum ==1){ 
                    sb.append("1");
                    carry =0;
                }
                else sb.append("0");
            }

            if(carry==1) sb.append("1");

             return sb.reverse().toString();
}
        }
      
    
