class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs=new ArrayList<>();
        boolean vis[]=new boolean[adj.size()+1];
        vis[0]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(int i:adj.get(node)){
                if(!vis[i]){
                    vis[i]=true;
                    q.offer(i);
                }
            }
        }
        return bfs;
    }
} 