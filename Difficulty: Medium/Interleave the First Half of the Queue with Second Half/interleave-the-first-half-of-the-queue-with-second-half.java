class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int size=q.size();
        int res[]=new int[size];
        int j=0;
        for(int i=0;i<size/2;i++){
            int ele=q.poll();
            res[j]=ele;
            j+=2;
        }
        j=1;
        for(int i=0;i<size/2;i++){
            int ele=q.poll();
            res[j]=ele;
            j+=2;
        }
        for(int i=0;i<size;i++){
            q.offer(res[i]);
        }
    }
}
