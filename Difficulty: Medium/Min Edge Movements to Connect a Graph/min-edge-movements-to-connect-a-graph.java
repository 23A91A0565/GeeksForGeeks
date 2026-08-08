class Solution {
    int minEdgesReq(int n, int[][] edges) {
        // code here
        if(edges.length<n-1){
            return -1;
        }
        ArrayList<ArrayList<Integer>> g=new ArrayList<>();
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        }
        for(int ele[]:edges){
            int a=ele[0];
            int b=ele[1];
            g.get(a).add(b);
            g.get(b).add(a);
        }
        int c=0;
        Queue<Integer> q=new LinkedList<>();
        
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i])continue;
            c++;
            q.offer(i);
            vis[i]=true;
            
            while(!q.isEmpty()){
                int ele=q.poll();
                for(int j:g.get(ele)){
                    if(!vis[j]){
                        q.offer(j);
                        vis[j]=true;
                    }
                }
            }
        }
        return c-1;
    }
}