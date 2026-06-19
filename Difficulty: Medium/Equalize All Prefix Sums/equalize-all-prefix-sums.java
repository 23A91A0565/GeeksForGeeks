class Solution {
    public ArrayList<Integer> optimalArray(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int curr=0;
        ans.add(curr);
        for(int i=1;i<arr.length;i++){
            int median=(i/2);
            curr+=arr[i]-arr[median];
            ans.add(curr);
        }
        return ans;
    }
}