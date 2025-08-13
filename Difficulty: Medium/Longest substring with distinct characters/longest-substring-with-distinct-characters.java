class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> ans=new HashSet<>();
        int max_length=0;
        int left=0,right=0;
        while(right<s.length()){
            char c=s.charAt(right);
            while(ans.contains(c))
            {
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(s.charAt(right));
            max_length=Math.max(max_length,right-left+1);
            right++;
            
        }
        return max_length;
    }
}