class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        HashMap<Character, Character> map = new HashMap<>();
        Character c;
        Character c1;
        if(s1.length() != s2.length()) return false;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            c1= s2.charAt(i);
            if(!map.containsKey(c) && !map.containsValue(c1))
            {
                map.put(c,c1);
            }
            else if(!c1.equals(map.get(c)) )
            {
                return false;
            }
        }
        return true;
        
    }
}