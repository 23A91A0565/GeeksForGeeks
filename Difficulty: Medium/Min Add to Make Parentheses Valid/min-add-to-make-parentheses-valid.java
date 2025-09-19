class Solution {
    public int minParentheses(String s) {
        Stack<Character> ans = new Stack<>();
        int co = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                ans.push(c);
            } else {
                if (!ans.isEmpty() && ans.peek() == '(') {
                    ans.pop(); 
                } else {
                    co++; 
                }
            }
        }

        return co + ans.size();
    }
}
