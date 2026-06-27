class Solution {
    public static int countWays(String s1, String s2) {
        // code here
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        int mod=(int)1e9+7;
        return solve(s1,s2,0,0,dp,mod);
    }
    public static int solve(String s1,String s2,int i,int j,int dp[][],int mod){
        if(j==s2.length()){
            return 1;
        }
        if(i>=s1.length()){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        
        char c1=s1.charAt(i);
        char c2=s2.charAt(j);
        long ans=0;
        if(c1==c2){
            ans=(solve(s1,s2,i+1,j+1,dp,mod)+solve(s1,s2,i+1,j,dp,mod))%mod;
        }
        else{
            ans=(solve(s1,s2,i+1,j,dp,mod))%mod;
        }
        dp[i][j]=(int)ans;
        return dp[i][j];
    }
}
