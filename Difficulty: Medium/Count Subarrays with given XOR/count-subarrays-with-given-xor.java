class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> ans=new HashMap<>();
        int res=0;
        ans.put(0,1);
        int xor=0;
        for(int ele:arr){
            xor^=ele;
            
            if(ans.containsKey(xor^k)){
                res+=ans.get(xor^k);
            }
            ans.put(xor,ans.getOrDefault(xor,0)+1);
        }
        return res;
    }
}