class Solution {
    public void rearrange(int arr[]) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int res[]=new int[n];
        int k=0;
        for(int i=0,j=n-1;i<=j;i++,j--)
        {
            if(k<n)res[k++]=arr[j];
            if(k<n)res[k++]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=res[i];
        }
    }
}
