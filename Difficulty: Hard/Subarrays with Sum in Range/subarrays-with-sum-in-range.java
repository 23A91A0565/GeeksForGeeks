class Solution {
    public int countSubarray(int[] arr, int l, int r) {
        // code here
        // here we are subsrtracting countAtmost(<=r) and countAtmost(<l)
        // so we can get the subarrays whose sum is in range from l to r
        return solve(arr,r)-solve(arr,l-1);
    }
    public int solve(int arr[],int k){
        int sum=0;
        int i=0,j=0;
        int ans=0;
        for(j=0;j<arr.length;j++){
            sum+=arr[j];
            while(sum>k){
                sum-=arr[i];
                i++;
            }
            ans+=j-i+1;
        }
        return ans;
    }
}