class Solution {

    public int countTriplets(int[] arr, int l, int r) {
        // code here
        Arrays.sort(arr);
        return count(arr,r)-count(arr,l-1);
    }
    public int count(int arr[],int x){
        int res=0;
        for(int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum<=x){
                    res+=right-left;
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}