class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int left =0 , right = 0 , maxSum = 0;
        int sum = 0;
        
        
        while(right <arr.length){
        
             if(right - left + 1 > k){
                 sum -= arr[left];
                 left++;
            } 
         
            sum += arr[right];
         
            maxSum = Math.max(sum , maxSum);         
         
            right++;
        }
        return maxSum;
    }
}