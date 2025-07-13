// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        TreeSet<Integer> ans=new TreeSet<>();
        for(int i:a)ans.add(i);
        for(int i:b)ans.add(i);
        return new ArrayList<>(ans);
    }
}
