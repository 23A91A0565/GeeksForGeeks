class Solution {
    
    static final long MOD = 1000000007;
    
    public int palindromicStrings(int n, int k) {
        // code here
        long ans = 0;

        // Check all lengths from 1 to n
        for (int len = 1; len <= n; len++) {

            int required;

            if (len % 2 == 0) {
                // Even: first half decides palindrome
                required = len / 2;
            } else {
                // Odd: first half + middle character
                required = len / 2 + 1;
            }

            // Number of ways to fill required positions
            long ways = 1;

            // Permutation: k * (k-1) * ...
            for (int i = 0; i < required; i++) {
                ways = (ways * (k - i)) % MOD;
            }

            // Add this length's count
            ans = (ans + ways) % MOD;
        }

        return (int) ans;
    }
}