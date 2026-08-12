class Solution {
    int mod=1000000007;
    public ArrayList<Integer> findWays(int[][] grid) {
        // Code here
        int n=grid.length;
        int path[][]=new int[n][n];
        int best[][]=new int[n][n];
        path[n-1][n-1]=1;
        best[n-1][n-1]=grid[n-1][n-1];
        
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                
                if(i==n-1 && j==n-1)continue;
                int count=0;
                int max=-1;
                
                if((grid[i][j]==1 || grid[i][j]==3) && j+1<n && path[i][j+1]>0){
                    count=(count+path[i][j+1])%mod;
                    max=Math.max(max,grid[i][j]+best[i][j+1]);
                }
                if((grid[i][j]==2 || grid[i][j]==3) && i+1<n && path[i+1][j]>0){
                    count=(count+path[i+1][j])%mod;
                    max=Math.max(max,grid[i][j]+best[i+1][j]);
                }
                
                path[i][j]=count;
                if(max!=-1)best[i][j]=max;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(path[0][0]%mod);
        ans.add(best[0][0]);
        return ans;
    }
}