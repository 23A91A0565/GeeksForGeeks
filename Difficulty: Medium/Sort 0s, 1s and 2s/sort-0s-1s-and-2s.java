class Solution {
    public void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int l=0,mid=0,h=n-1;
        while(mid<=h){
            if(arr[mid]==0){
                swap(arr,l,mid);
                mid++;
                l++;
            }
            else if(arr[mid]==1)mid++;
            else{
                swap(arr,mid,h);
                h--;
            }
        }
    }
    public void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}