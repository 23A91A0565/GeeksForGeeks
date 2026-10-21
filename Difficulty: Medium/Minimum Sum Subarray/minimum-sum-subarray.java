class Solution {
    public int minSubarraySum(int[] arr) {
        // code here
        int min=Integer.MAX_VALUE;
        int curr=0;
        for(int ele:arr){
            curr=Math.min(curr+ele,ele);
            min=Math.min(min,curr);
        }
        return min;
    }
}