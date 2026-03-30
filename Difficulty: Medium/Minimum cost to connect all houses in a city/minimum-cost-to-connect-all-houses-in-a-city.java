

class Solution {
    public int minCost(int[][] houses) {
        // code here
        int n=houses.length;
        int m=houses[0].length;
        boolean visited[]=new boolean[n];
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        int total=0;
        
        for(int i=0;i<n;i++){
            int u=-1;
            
            for(int j=0;j<n;j++){
                if(!visited[j] && (u==-1 || dist[j]<dist[u])){
                    u=j;
                }
            }
            
            visited[u]=true;
            total+=dist[u];
            
            for(int j=0;j<n;j++){
                if(!visited[j]){
                    int cost=Math.abs(houses[u][0]-houses[j][0])+
                                Math.abs(houses[u][1]-houses[j][1]);
                    if(cost<dist[j]){
                        dist[j]=cost;
                    }
                }
            }
        }
        return total;
    }
}
