class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]<arr[high]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}