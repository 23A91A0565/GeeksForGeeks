// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        Set<Integer> elements = new HashSet<>();
        for(int num : b)
        elements.add(num);
        ArrayList<Integer> notPresent = new ArrayList<>();
        
        for(int num : a) {
        if(!elements.contains(num)) {
        notPresent.add(num);
        
        }
      }
        
        return notPresent;
    }
}
