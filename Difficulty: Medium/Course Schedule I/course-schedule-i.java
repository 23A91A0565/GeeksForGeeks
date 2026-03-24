class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int ele[]:prerequisites){
            adj.get(ele[1]).add(ele[0]);
        }
        boolean vis[]=new boolean[n];
        boolean path[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(adj,vis,i,path))return false;
            }
        }
        return true;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean vis[],int ind,boolean path[]){
        vis[ind]=true;
        path[ind]=true;
        for(int ele:adj.get(ind)){
            if(!vis[ele]){
                if(dfs(adj,vis,ele,path))return true;
            }
            else if(path[ele])return true;;
        }
        path[ind]=false;
        return false;
    }
}