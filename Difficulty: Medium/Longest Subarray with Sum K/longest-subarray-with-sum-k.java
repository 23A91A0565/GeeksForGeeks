// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxlen = 0;
        int cursum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,0);
        for(int i =0; i < arr.length;i++){
            cursum+=arr[i];
            if(cursum==k)maxlen = i+1;
            if(hm.containsKey(cursum-k)){
                int prev = hm.get(cursum-k);
                maxlen = Math.max(maxlen,i-prev);
            }
            if(!hm.containsKey(cursum)){
                hm.put(cursum,i);
            }
        }
        return maxlen;
    }
}
