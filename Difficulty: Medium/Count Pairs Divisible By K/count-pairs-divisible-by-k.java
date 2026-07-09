class Solution {
    public int countKdivPairs(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> ans=new HashMap<>();
        int res=0;
        for(int ele:arr){
            int curr=ele%k;
            int req=0;
            if(curr==0)
                req=0;
            else 
                req=k-curr;
            res+=ans.getOrDefault(req,0);
            ans.put(curr,ans.getOrDefault(curr,0)+1);
        }
        return res;
    }
}