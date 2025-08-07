// User function Template for Java

class Solution {
    boolean isDivisible(String s) {
        // code here
        int even=0,odd=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(i%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        if((even-odd)%3==0) return true;
        return false;
    }
}