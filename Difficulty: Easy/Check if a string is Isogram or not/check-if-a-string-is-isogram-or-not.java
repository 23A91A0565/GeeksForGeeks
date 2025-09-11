

class Solution {
    // Function to check if a string is Isogram or not.
    static boolean isIsogram(String data) {
        // Your code here
        HashMap<Character, Integer> hp = new HashMap<>();
        
        for(char c: data.toCharArray()) {
            hp.put(c, hp.getOrDefault(c, 0) + 1);
            
            if(hp.get(c) > 1) return false;
        }
        
        return true;
    }
}