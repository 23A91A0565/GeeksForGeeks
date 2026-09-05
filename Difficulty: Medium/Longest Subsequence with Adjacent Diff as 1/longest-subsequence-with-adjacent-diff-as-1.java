class Solution {
    public int longestSubseq(int[] arr) {
        // code here
        HashMap<Integer,Integer> h=new HashMap<>();
        int res=0;
        for(int ele:arr){
            int curr=1;
            if(h.containsKey(ele-1)){
                curr=Math.max(curr,h.get(ele-1)+1);
            }
            if(h.containsKey(ele+1)){
                curr=Math.max(curr,h.get(ele+1)+1);
            }
            h.put(ele,Math.max(h.getOrDefault(ele,0),curr));
            res=Math.max(res,h.get(ele));
        }
        return res;
    }
}
