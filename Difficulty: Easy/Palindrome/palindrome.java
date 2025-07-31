class Solution {
    public boolean isPalindrome(int n) {
        // code here
        String ans=String.valueOf(n);
        for(int i =0;i<ans.length()/2;i++){
            if(ans.charAt(i) != ans.charAt(ans.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}