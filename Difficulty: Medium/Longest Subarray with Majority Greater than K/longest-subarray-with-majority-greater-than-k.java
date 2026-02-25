class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        HashMap<Integer,Integer> ans=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(ele<=k){
                prev-=1;
            }
            if(ele>k){
                prev+=1;
            }
            
            if(prev>0){
                max=Math.max(max,i+1);
            }
            else{
                if(ans.containsKey(prev-1)){
                    max=Math.max(max,i-ans.get(prev-1));
                }
                if(!ans.containsKey(prev)){
                    ans.put(prev,i);
                }
            }
            
        }
        return max==Integer.MIN_VALUE?0:max;
    }
}