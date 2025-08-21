class Solution {
    public int totalElements(int[] arr) {
        // code here
        int st=0,end=0;
        int max_len=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        while(end<arr.length){
            ans.put(arr[end],ans.getOrDefault(arr[end],0)+1);
            while(ans.size()>2){
                ans.put(arr[st],ans.get(arr[st])-1);
                if(ans.get(arr[st])==0){
                    ans.remove(arr[st]);
                }
                st++;
            }
            max_len=Math.max(max_len,end-st+1);
            end++;
        }
        return max_len;
    }
}