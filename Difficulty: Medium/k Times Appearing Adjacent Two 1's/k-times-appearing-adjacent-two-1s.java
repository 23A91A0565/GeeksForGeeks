class Solution {
    public int countStrings(int n, int k) {
        // code here
        int dp[][][]=new int[n+1][k+1][2];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<k+1;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int mod=(int)1e9+7;
        int ans=solve(1,0,0,n,k,mod,dp);
        ans=(ans+solve(1,0,1,n,k,mod,dp))%mod;
        return ans%mod;
    }
    public static int solve(int index,int cnt,int prev,int n,int k,int mod,int dp[][][]){
        if(cnt>k){
            return 0;
        }
        if(index==n){
            if(cnt==k)return 1;
            else return 0;
        }
        if(dp[index][cnt][prev]!=-1)return dp[index][cnt][prev];
        int ans=0;
        
        ans=(ans+solve(index+1,cnt,0,n,k,mod,dp))%mod;
        
        if(prev==1){
            ans=(ans+solve(index+1,cnt+1,1,n,k,mod,dp))%mod;
        }
        else{
            ans=(ans+solve(index+1,cnt,1,n,k,mod,dp))%mod;
        }
        return dp[index][cnt][prev]=ans;
    }
    
}