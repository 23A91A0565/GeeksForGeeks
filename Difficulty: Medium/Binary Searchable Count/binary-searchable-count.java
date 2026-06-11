class Solution {
    public int binarySearchable(int[] arr) {
        // code here
        int res=0;
        for(int ele:arr){
            if(check(arr,ele))res++;
        }
        return res;
    }
    public boolean check(int arr[],int ele){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==ele)return true;
            else if(arr[mid]>ele)h=mid-1;
            else l=mid+1;
        }
        return false;
    }
};