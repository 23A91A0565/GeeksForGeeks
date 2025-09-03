class Solution {
    public int maxWater(int arr[]) {
        int left=0;
        int right=arr.length-1;
        int lmax=0,rmax=0;
        int total=0;
        while(left<right)
        {
            if(arr[left]<arr[right])
            {
                if(lmax<arr[left])
                {
                    lmax=arr[left];
                }
                else{
                    total+=lmax-arr[left];
                }
                 left++;
            }
            else{
                if(rmax<arr[right])
                {
                    rmax=arr[right];
                }
                else{
                    total+=rmax-arr[right];
                }
                  right--;
            }
        }
        return total;
    }
}
