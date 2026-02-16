// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int max=Integer.MAX_VALUE;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(i+m-1<arr.size()){
                max=Math.min(max,arr.get(m+i-1)-arr.get(i));
            }
            
        }
        return max;
    }
}