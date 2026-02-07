class Solution {
    int maxSum(int[] arr) {
        // code here
        int n=arr.length;
        int res=0;
        int sum=0,curr=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            curr+=(i*arr[i]);
        }
        res=curr;
        
        for(int i=1;i<arr.length;i++){
            int last=arr[n-i];
            curr=curr+(sum-last)-(n-1)*last;
            res=Math.max(res,curr);
        }
        return res;
    }
}