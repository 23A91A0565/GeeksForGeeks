class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<int[]>> l=new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        for(int edge[]:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            l.get(u).add(new int[]{v,wt});
            l.get(v).add(new int[]{u,wt});
        }
        
        int sum=0;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
        boolean visited[]=new boolean[V];
        
        q.offer(new int[]{0,0});
        while(!q.isEmpty()){
            int a[]=q.poll();
            int dist=a[0];
            int node=a[1];
            
            if(visited[node])continue;
            sum+=dist;
            visited[node]=true;
            for(int lis[]:l.get(node)){
                if(!visited[lis[0]]){
                    q.offer(new int[]{lis[1],lis[0]});
                }
            }
        }
        return sum;
    }
}
