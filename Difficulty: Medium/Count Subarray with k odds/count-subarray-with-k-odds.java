class Solution {
    public int countSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        int pre=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            pre+=arr[i]%2;
            if(ans.containsKey(pre-k)){
                res+=ans.get(pre-k);
            }
            ans.put(pre,ans.getOrDefault(pre,0)+1);
        }
        return res;
    }
}
