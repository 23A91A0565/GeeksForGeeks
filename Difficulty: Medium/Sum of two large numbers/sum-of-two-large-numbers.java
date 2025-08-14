// User function Template for Java

class Solution {
    String findSum(String s1, String s2) {
        // code here
        // code here
        StringBuilder num1 = new StringBuilder(s1);
        StringBuilder num2 = new StringBuilder(s2);
        
        num1.reverse();
        num2.reverse();
        
        StringBuilder result = new StringBuilder();
        int i=0;
        int j=0;
        int carry=0;
        
        while(i < num1.length() || j < num2.length() || carry != 0){
            int sum=carry;
            
            if(i<num1.length()){
                sum += num1.charAt(i++) - '0';
            }
            if(j<num2.length()){
                sum+=num2.charAt(j++) -'0';
            }
            
            result.append(sum%10);
            carry=sum/10;
        }
        result.reverse();
        
         
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        
        return result.toString();
    }
}