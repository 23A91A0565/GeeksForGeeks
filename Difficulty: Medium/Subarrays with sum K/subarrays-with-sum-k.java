class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int c=0;
        int pre=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
            pre+=arr[i];
            int req=pre-k;
            if(ans.containsKey(req))
            {
                c+=ans.get(req);
            }
            ans.put(pre,ans.getOrDefault(pre,0)+1);
        }
        return c;
    }
}