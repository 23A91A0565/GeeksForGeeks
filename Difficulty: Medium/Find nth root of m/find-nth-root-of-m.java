class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int l = 1, h = m;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            long val = power(mid, n, m); 
            if (val == m) return mid;
            else if (val < m) l = mid + 1;
            else h = mid - 1;
        }
        
        return -1;
    }
    private long power(int base, int exp, int limit) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > limit) return result;
        }
        return result;
    }
}