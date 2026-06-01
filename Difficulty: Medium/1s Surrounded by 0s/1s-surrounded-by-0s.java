class Solution {
    int cntOnes(int[][] grid) {
        // code here
        int n=grid.length;
        int m=grid[0].length;
        boolean ans[][]=new boolean[n][m];
        for(int i=0;i<m;i++){
            if(grid[0][i]==1){
                dfs(grid,ans,0,i);
            }
            if(grid[n-1][i]==1){
                dfs(grid,ans,n-1,i);
            }
        }
        
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                dfs(grid,ans,i,0);
            }
            if(grid[i][m-1]==1){
                dfs(grid,ans,i,m-1);
            }
        }
        
        
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!ans[i][j] && grid[i][j]==1){
                    res++;
                }
            }
        }
        return res;
    }
    public void dfs(int grid[][],boolean ans[][],int i,int j){
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        int n=grid.length;
        int m=grid[0].length;
        ans[i][j]=true;
        for(int k=0;k<4;k++){
            int x=dir[k][0]+i;
            int y=dir[k][1]+j;
            if(x<n && y<m  && x>=0 && y>=0 && grid[x][y]==1 && !ans[x][y]){
                dfs(grid,ans,x,y);
            }
        }
    }
};