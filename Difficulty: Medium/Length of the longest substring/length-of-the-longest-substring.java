// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        int right =0 , left =0, maxlen =0;
        HashSet<Character> ans = new HashSet<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            if(!ans.contains(ch)){
                ans.add(ch);
                maxlen= Math.max(maxlen ,right-left+1);
                right++;
            }
            else {
                ans.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;
    }
}