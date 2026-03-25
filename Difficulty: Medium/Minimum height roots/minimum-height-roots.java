class Solution {
    public ArrayList<Integer> minHeightRoot(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int deg[]=new int[V];
        for(int ele[]:edges){
            adj.get(ele[0]).add(ele[1]);
            adj.get(ele[1]).add(ele[0]);
            deg[ele[0]]++;
            deg[ele[1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(deg[i]==1){
                q.offer(i);
            }
        }
        int rem=V;
        while(rem>2){
            int size=q.size();
            rem-=size;
            
            while(size-->0){
                int node=q.poll();
                
                for(int ele:adj.get(node)){
                    deg[ele]--;
                    if(deg[ele]==1){
                        q.offer(ele);
                    }
                }
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;
    }
}