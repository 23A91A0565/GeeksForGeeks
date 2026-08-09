class Solution {
    public int zigzagSequence(int[][] mat) {
        // code here
        int n=mat.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=mat[0][i];
        }
        
        for(int i=1;i<n;i++){
            int next[]=new int[n];
            int max=Integer.MIN_VALUE;
            int secMax=Integer.MIN_VALUE;
            int maxInd=0;
            
            for(int j=0;j<n;j++){
                if(dp[j]>max){
                    secMax=max;
                    max=dp[j];
                    maxInd=j;
                }
                else if(dp[j]>secMax){
                    secMax=dp[j];
                }
            }
            
            for(int j=0;j<n;j++){
                int top=(maxInd==j)?secMax:max;
                next[j]=mat[i][j]+top;
            }
            dp=next;
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i]);
        }
        return ans;
    }
}