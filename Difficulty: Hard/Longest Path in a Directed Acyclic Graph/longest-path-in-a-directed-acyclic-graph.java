class Solution {
    public int[] maxDistance(int V, int src, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<int[]>> l=new ArrayList<>();
        for(int i=0;i<V;i++){
            l.add(new ArrayList<>());
        }
        for(ArrayList<Integer> e:edges){
            int u=e.get(0);
            int v=e.get(1);
            int w=e.get(2);
            l.get(u).add(new int[]{v,w});
        }
        int ind[]=new int[V];
        for(ArrayList<Integer> t:edges){
            ind[t.get(1)]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(ind[i]==0){
                q.offer(i);
            }
        }
        ArrayList<Integer> sort=new ArrayList<>();
        while(!q.isEmpty()){
            int curr=q.poll();
            sort.add(curr);
            for(int ele[]:l.get(curr)){
                ind[ele[0]]--;
                if(ind[ele[0]]==0){
                    q.offer(ele[0]);
                }
            }
        }
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MIN_VALUE);
        dist[src]=0;
        for(int u:sort){
            if(dist[u]==Integer.MIN_VALUE)continue;
            for(int ele[]:l.get(u)){
                int v=ele[0];
                int w=ele[1];
                dist[v]=Math.max(dist[v],dist[u]+w);
            }
        }
        return dist;
    }
}
