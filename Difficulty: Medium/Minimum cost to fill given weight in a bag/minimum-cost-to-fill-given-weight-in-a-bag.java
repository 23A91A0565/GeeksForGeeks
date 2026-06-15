class Solution {
    int st=(int)1e9;
    public int minimumCost(int[] cost, int w) {
        // code here
        int n=cost.length;
        int dp[][]=new int[n+1][w+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        
        int res=solve(0,w,cost,dp);
        if(res>=st)return -1;
        return res;
    }
    public int solve(int i,int w,int cost[],int dp[][]){
        if(w==0)return 0;
        if(i==cost.length)return st;
        if(dp[i][w]!=-1)return dp[i][w];
        int notake=solve(i+1,w,cost,dp);
        int take=st;
        if(cost[i]!=-1 && w>=i+1){
            take=solve(i,w-(i+1),cost,dp)+cost[i];
        }
        return dp[i][w]=Math.min(take,notake);
    }
}