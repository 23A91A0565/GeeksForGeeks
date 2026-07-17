class Solution {
    public int maxDiffSubArrays(int[] arr) {
        
        int n = arr.length;

        int[] preMin = new int[n];
        int[] preMax = new int[n];
        int[] suffMin = new int[n];
        int[] suffMax = new int[n];

        int curMin = arr[0], curMax = arr[0];
        preMin[0] = arr[0];
        preMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            curMin = Math.min(arr[i], curMin + arr[i]);
            preMin[i] = Math.min(preMin[i - 1], curMin);

            curMax = Math.max(arr[i], curMax + arr[i]);
            preMax[i] = Math.max(preMax[i - 1], curMax);
        }

        curMin = arr[n - 1];
        curMax = arr[n - 1];
        suffMin[n - 1] = arr[n - 1];
        suffMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            curMin = Math.min(arr[i], curMin + arr[i]);
            suffMin[i] = Math.min(suffMin[i + 1], curMin);

            curMax = Math.max(arr[i], curMax + arr[i]);
            suffMax[i] = Math.max(suffMax[i + 1], curMax);
        }

        int res = 0;

        for (int i = 0; i < n - 1; i++) {
            res = Math.max(res, Math.abs(preMax[i] - suffMin[i + 1]));
            res = Math.max(res, Math.abs(preMin[i] - suffMax[i + 1]));
        }

        return res;
    }
}