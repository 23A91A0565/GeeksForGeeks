class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        if((total+diff)%2!=0)return 0;
        int tar=(total+diff)/2;
        
        int dp[][]=new int[arr.length+1][tar+1];
        
        for(int i=0;i<=arr.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=arr.length;i++){
            for(int j=0;j<=tar;j++){
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[arr.length][tar];
    }
}
