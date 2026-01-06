class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
         int n = arr.length;
        int currXor = 0;

        for (int i = 0; i < k; i++) {
            currXor ^= arr[i];
        }

        int max = currXor;
        for (int i = k; i < n; i++) {
            currXor ^= arr[i - k]; 
            currXor ^= arr[i]; 
            max = Math.max(max, currXor);
        }

        return max;
    }
}
