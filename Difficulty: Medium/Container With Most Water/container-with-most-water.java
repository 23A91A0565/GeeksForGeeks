class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int max=0;
        int left=0,right=arr.length-1;
        while(left<=right)
        {
            int d1=right-left;
            int min=Math.min(arr[left],arr[right]);
            max=Math.max(max,min*d1);
            if(arr[left]<arr[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}