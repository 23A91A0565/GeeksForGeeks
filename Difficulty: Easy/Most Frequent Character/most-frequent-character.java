class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        Map<Character, Integer> freq = new TreeMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        char maxChar = s.charAt(0);
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }
}