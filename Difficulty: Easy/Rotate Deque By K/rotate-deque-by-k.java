class Solution {
    public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        while(k-->0){
            if(type==1){
                int last=dq.removeLast();
                dq.addFirst(last);
            }else{
                int first=dq.removeFirst();
                dq.addLast(first);
            }
        }
    }
}