class Solution {
    public int minThrows(int n, int[] lad, int[] sn) {
        // code here
        int N=n*n;
        int jump[]=new int[N+1];
        Arrays.fill(jump,-1);
        for(int i=0;i<lad.length;i+=2){
            jump[lad[i]]=lad[i+1];
        }
        for(int i=0;i<sn.length;i+=2){
            jump[sn[i]]=sn[i+1];
        }
        
        boolean vis[]=new boolean[N+1];
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        vis[1]=true;
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.poll();
                if(curr==N)return count;
                for(int j=1;j<=6;j++){
                    int next=curr+j;
                    if(next>N){
                        continue;
                    }
                    if(jump[next]!=-1){
                        next=jump[next];
                    }
                    if(!vis[next]){
                        vis[next]=true;
                        q.offer(next);
                    }
                }
            }
            count++;
        }
        return -1;
    }
}