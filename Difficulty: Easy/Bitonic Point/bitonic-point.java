// User function Template for Java

class Solution {
    public int findMaximum(int[] arr) {
        // code here
        int ans=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
            else{
                break;
            }
        }
        return ans;
    }
}