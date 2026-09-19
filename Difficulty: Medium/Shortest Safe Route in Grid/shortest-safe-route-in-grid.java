class Solution {
    int shortestPath(int[][] mat) {
        // code here
        int dir[][]={{-1,0},{0,1},{0,-1},{1,0}};
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    for(int k=0;k<4;k++){
                        int nx=i+dir[k][0];
                        int ny=j+dir[k][1];
                        if(nx>=0 && nx<n && ny>=0 && ny<m && mat[nx][ny]==1){
                            mat[nx][ny]=-1;
                        }
                    }
                }
            }
        }
        
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        
        for(int i=0;i<n;i++){
            if(mat[i][0]==1){
                q.offer(new int[]{i,0,1});
                vis[i][0]=true; 
            }
        }
        
        while(!q.isEmpty()){
            
            int ele[]=q.poll();
            int x = ele[0];
            int y = ele[1];
            int steps = ele[2];
            
            if(y==m-1){
                return steps;
            }
            
            for(int k=0;k<4;k++){
                int nx=ele[0]+dir[k][0];
                int ny=ele[1]+dir[k][1];
                
                if(nx>=0 && nx<n && ny>=0 && ny<m && !vis[nx][ny] && mat[nx][ny]==1){
                    q.offer(new int[]{nx,ny,steps+1});
                    vis[nx][ny]=true;
                }
            }
        }
        return -1;
    }
}
