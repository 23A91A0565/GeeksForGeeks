class Solution {
    public int count(int n, int m) {
        // code here
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=0;
        for(int i=1;i<=m;i++){
            ans+=solve(n,m,i,1,dp);
        }
        return ans;
    }
    public int solve(int n,int m,int cur,int size,int dp[][]){
        if(size==n){
            return 1;
        }
        if(dp[size][cur]!=-1)return dp[size][cur];
        
        int ans=0;
    
        for(int i=1;i<=m;i++){
            if(i%cur==0 || cur%i==0){
                ans+=solve(n,m,i,size+1,dp);
            }
        }
        return dp[size][cur]=ans;
    }
}