class Solution {
    public int mean(int[] arr) {
        // code here
        int N=arr.length;
        int sum =0;
       for(int i=0; i<N; i++){
           sum+=arr[i];
       }
       return sum/N;
    }

    public int median(int[] arr) {
        
        // code here
        Arrays.sort(arr);
        int N=arr.length;
       if(N%2==1){
           return arr[N/2];
       }
       return (arr[N/2]+arr[(N/2)-1])/2;
    }
}