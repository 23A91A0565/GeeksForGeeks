class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
         // Your code here
        Set<Integer> hash1 = new HashSet<>();
        Set<Integer> hash2 = new HashSet<>();
        for(int i:a)
        {
            hash1.add(i);
        }
        for(int j:b)
        {
            if(hash1.contains(j))
            {
                hash2.add(j);
            }
        }
        return hash2.size();
    }
}