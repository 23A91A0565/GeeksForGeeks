class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n=adj.size();
        boolean vis[]=new boolean[n];
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(0,vis,adj,ans);
        return ans;
    }
    public void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>res){
        vis[node]=true;
        res.add(node);
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,adj,res);
            }
        }
    }
}