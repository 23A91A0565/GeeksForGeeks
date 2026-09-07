class Solution {
    
    int n;
    int dp[][][];
    int arr[];
    
    public int minCount(int[] arr) {
        // code here
        this.arr=arr;
        this.n=arr.length;
        dp=new int[n+1][n+1][n+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        
        int ans=solve(0,-1,-1);
        return n-ans;
    }
    public int solve(int ind,int incLast,int decLast){
        if(ind==n){
            return 0;
        }
        int a=incLast+1;
        int b=decLast+1;
        
        if(dp[ind][a][b]!=-1){
            return dp[ind][a][b];
        }
        
        // skipping the current element
        int ans=solve(ind+1,incLast,decLast);
        
        // adding element to increasing subsequence
        if(incLast==-1 || arr[incLast]<arr[ind]){
            ans=Math.max(ans,1+solve(ind+1,ind,decLast));
        }
        
        // adding element to the decreasing subsequence
        if(decLast==-1 || arr[decLast]>arr[ind]){
            ans=Math.max(ans,1+solve(ind+1,incLast,ind));
        }
        
        return dp[ind][a][b]=ans;
        
    }
}