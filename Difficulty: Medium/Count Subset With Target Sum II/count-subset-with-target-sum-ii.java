class Solution {
    public int countSubset(int[] arr, int k) {
        // code here
        int n=arr.length;
        int dp[][]=new int[arr.length][k+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=k;j++){
                dp[i][j]=-1;
            }
        }
        int val=solve(k,arr,0,dp);
        return val;
    }
    public int solve(int k,int arr[],int ind,int dp[][]){
        if(ind==arr.length){
            if(k==0)return 1;
            else return 0;
        }
        if(dp[ind][k]!=-1){
            return dp[ind][k];
        }
        int include=0;
        if(arr[ind]<=k && arr[ind]>=0){
            include=solve(k-arr[ind],arr,ind+1,dp);
        }
        
        int exclude=solve(k,arr,ind+1,dp);
        return dp[ind][k]=include+exclude;
    }
}