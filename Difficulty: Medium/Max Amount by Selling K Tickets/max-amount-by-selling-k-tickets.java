class Solution {
    public int maxAmount(int[] arr, int k) {
        // code here
        int res=0;
        int mod=(int)1e9+7;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.offer(ele);
        }
        while(k-->0 && !pq.isEmpty()){
            int ele=pq.poll();
            res=(res+ele)%mod;
            if(ele>0){
                pq.offer(ele-1);
            }
        }
        return res;
    }
}