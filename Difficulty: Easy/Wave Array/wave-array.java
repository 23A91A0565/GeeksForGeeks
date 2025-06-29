class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int a[]=new int[arr.length];
        if(arr.length%2==0)
        {
            for(int i=0;i<arr.length;i+=2)
            {
             int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<arr.length-1;i+=2)
            {
             int temp=arr[i];
             arr[i]=arr[i+1];
             arr[i+1]=temp;
            }
        }    
    }
}
