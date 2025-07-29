// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                return s.charAt(i) + "";
            }
        }
        
        return "-1";
    }
}