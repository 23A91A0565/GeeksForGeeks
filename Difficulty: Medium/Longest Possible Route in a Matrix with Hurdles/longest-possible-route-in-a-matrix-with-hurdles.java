class Solution {
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        // code here
        int res=0;
        if(mat[xs][ys]==0 || mat[xd][yd]==0)return -1;
        
        boolean vis[][]=new boolean[mat.length][mat[0].length];
        res=solve(mat,xs,ys,xd,yd,vis);
        return res;
    }
    public static int solve(int mat[][],int i,int j,int n,int m,boolean vis[][]){
        if(i==n && j==m)return 0;
        
        int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
        int res=-1;
        
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int nx=i+dir[k][0];
            int ny=j+dir[k][1];
            if(nx>=0 && nx<mat.length && ny>=0 && ny<mat[0].length && mat[nx][ny]!=0 && !vis[nx][ny]){
                int cur=solve(mat,nx,ny,n,m,vis);
                if(cur!=-1){
                    res=Math.max(res,cur+1);
                }
            }
        }
        
        vis[i][j]=false;
        return res;
    }
}