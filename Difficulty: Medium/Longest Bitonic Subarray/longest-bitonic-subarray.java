class Solution {
    public int bitonic(int[] arr) {
        // code here
        int n=arr.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        int c=1;
        pre[0]=c;
        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                c+=1;
                pre[i]=c;
            }
            else{
                c=1;
                pre[i]=c;
            }
        }
        c=1;
        suff[n-1]=c;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=arr[i+1]){
                c+=1;
                suff[i]=c;
            }
            else{
                c=1;
                suff[i]=c;
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,pre[i]+suff[i]-1);
        }
        return max;
    }
}