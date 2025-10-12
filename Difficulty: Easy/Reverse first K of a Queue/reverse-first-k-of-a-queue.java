class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> ans=new Stack<>();
        int n=q.size();
        while(k-->0 && k<n){
            ans.push(q.poll());
        }
        Queue<Integer> res=new LinkedList<>();
        while(!ans.isEmpty()){
            res.offer(ans.pop());
        }
        while(!q.isEmpty()){
            res.offer(q.poll());
        }
        return res;
    }
}