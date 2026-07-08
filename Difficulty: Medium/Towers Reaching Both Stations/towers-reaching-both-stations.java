class Solution {
    public int countCoordinates(int[][] mat) {
        // code here
        int res=0;
        int n=mat.length;
        int m=mat[0].length;
        boolean p[][]=new boolean[n][m];
        boolean q[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            p[i][0]=true;
            bfs(mat,p,i,0);
            q[i][m-1]=true;
            bfs(mat,q,i,m-1);
        }
        for(int i=0;i<m;i++){
            p[0][i]=true;
            bfs(mat,p,0,i);
            q[n-1][i]=true;
            bfs(mat,q,n-1,i);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(p[i][j] && q[i][j]){
                    res+=1;
                }
            }
        }
        return res;
        
    }
    public static void bfs(int mat[][],boolean ans[][],int i,int j){
        int n=mat.length;
        int m=mat[0].length;
        int dir[][]={{-1,0},{0,1},{1,0},{0,-1}};
        for(int k=0;k<4;k++){
            int nx=i+dir[k][0];
            int ny=j+dir[k][1];
            if(nx>=0 && nx<n && ny>=0 && ny<m){
                if(mat[i][j]<=mat[nx][ny] && !ans[nx][ny]){
                    ans[nx][ny]=true;
                    bfs(mat,ans,nx,ny);
                }
            }
        }
    }
}