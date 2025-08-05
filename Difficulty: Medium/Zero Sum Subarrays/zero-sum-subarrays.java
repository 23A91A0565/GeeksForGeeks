class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        HashMap<Integer,Integer> ans=new HashMap<>();
        ans.put(0,1);
        int pre=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            pre+=arr[i];
            if(ans.containsKey(pre))
            {
                c+=ans.get(pre);
            }
            ans.put(pre,ans.getOrDefault(pre,0)+1);
        }
        return c;
    }
}
