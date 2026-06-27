class Solution {
    public int countWays(int n, int m) {
        // code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        solve(n,n,m,dp);
        return dp[n];
    }
    public static int solve(int ind,int n,int m,int dp[]){
        int mod=(int)1e9+7;
        if(ind<m)return dp[ind]=1;
        if(ind==m)return dp[ind]=2;
        if(dp[ind]!=-1)return dp[ind];
        dp[ind]=(solve(ind-1,n,m,dp)+solve(ind-m,n,m,dp))%mod;
        return dp[ind];
    }
}