// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        StringBuilder str_build=new StringBuilder();
        
        for(int i=0;i<s.length();i++) {
            String ch=s.charAt(i)+"";
            if(!str_build.toString().contains(ch)) {
                str_build.append(ch);
            }
        }      
        
        return str_build.toString();
    }
}