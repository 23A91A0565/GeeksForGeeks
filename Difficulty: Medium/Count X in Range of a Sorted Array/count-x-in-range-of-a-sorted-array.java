class Solution {
    
    public ArrayList<Integer> countXInRange(int[] arr, int[][] queries) {
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int[] q : queries) {
            int left = q[0];
            int right = q[1];
            int x = q[2];
            
            int lb = lowerBound(arr, x);
            int ub = upperBound(arr, x);
            
            int count = Math.max(0, Math.min(ub, right + 1) - Math.max(lb, left));
            res.add(count);
        }
        return res;
    }
    
    private int lowerBound(int[] arr, int x) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] < x)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
    
    private int upperBound(int[] arr, int x) {
        int l = 0, h = arr.length;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] <= x)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
}
