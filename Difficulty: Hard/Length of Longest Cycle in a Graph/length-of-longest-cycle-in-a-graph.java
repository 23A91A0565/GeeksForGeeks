class Solution {
    public int longestCycle(int V, int[][] edges) {
        // code here
       int n=edges.length,res=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(edges[i][0],edges[i][1]);
        }
        for(int i=0;i<V;i++){
            boolean vis[]=new boolean[V];
            int p=i,c=0;
            boolean de=false;
            while(vis[p]==false){
                vis[p]=true;
                c++;
                if(hm.containsKey(p))
                    p=hm.get(p);
                else{
                    de=true;
                    break;
                }
            }
            if(!de && p==i)
                res=Math.max(res,c);
        }
        return res;
    }
}