class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        int pivot=0;
        pivot=findPos(arr);
        int left=calculate(arr,x,0,pivot-1);
        int right=calculate(arr,x,pivot,arr.length-1);
        return left+right;
    }
    public int findPos(int arr[]){
        int l=0,r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]>arr[r]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
    public int calculate(int arr[],int ele,int l,int r){
        if(l>r)return 0;
        int ans=l-1;
        int left=l;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=ele){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans-left+1;
    }
}
