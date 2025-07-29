/*
     arr[] is the array
*/
class Solution {
    public static long product(long arr[]) {
        // your code here
        long ans = 1;
        int MOD = 1000000007;
        for(int i = 0; i < arr.length; i++){
            ans = (ans * arr[i]) % MOD;
        }
        return ans % MOD;
    }
}