class Solution {
    public int find(int[] arr) {
        // code here
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int l=0,h=max;
        int ans=max;
        while(l<=h){
            int mid=(l+h)/2;
            if(satisfy(arr,mid,max)){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean satisfy(int arr[],int ele,int max){
        long temp=ele;
        for(int i:arr){
            temp=2*temp-i;
            if(temp>=max)return true;
            if(temp<0)return false;
        }
        return true;
    }
}
