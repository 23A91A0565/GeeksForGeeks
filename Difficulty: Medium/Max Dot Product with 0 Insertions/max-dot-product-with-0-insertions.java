class Solution {
    public int maxDotProduct(int[] a, int[] b) {
        // code here
        int n=a.length;
        int m=b.length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=solve(0,0,n,m,dp,a,b);
        return ans;
    }
    public int solve(int i,int j,int n,int m,int dp[][],int a[],int b[]){
        if(j>=m || (n-i)<(m-j))return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j]=Math.max(a[i]*b[j]+solve(i+1,j+1,n,m,dp,a,b),solve(i+1,j,n,m,dp,a,b));
    }
}