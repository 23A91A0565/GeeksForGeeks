class Solution {
    public static int minIndexChar(String s1, String s2) {
        // code here
        boolean[] existS2 = new boolean[26];
 
        for (int i = 0; i < s2.length(); i++) {
            existS2[s2.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (existS2[ch - 'a'] == true)
            return i;
        }
        return -1;

    }
}