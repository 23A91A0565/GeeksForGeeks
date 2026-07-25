class Solution {
    public int maximumSum(int[][] mat, int k) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int dp[][]=new int[n+1][m+1];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=mat[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
                }
                
                if(i>=k && j>=k){
                    max=Math.max(max,dp[i][j]-dp[i-k][j]-dp[i][j-k]+dp[i-k][j-k]);
                }
            }
        }
        return max;
    }
}