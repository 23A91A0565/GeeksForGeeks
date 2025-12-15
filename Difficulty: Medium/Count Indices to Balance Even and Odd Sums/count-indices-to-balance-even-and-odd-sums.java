class Solution {
    public int cntWays(int[] arr) {
        // code here
        int c=0,n=arr.length;
        int totEv=0,totOd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                totEv+=arr[i];
            }
            else{
                totOd+=arr[i];
            }
        }
        int preEv=0,preOd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                totEv-=arr[i];
            }
            else{
                totOd-=arr[i];
            }
            
            if(preEv+totOd == preOd+totEv){
                c+=1;
            }
            
            if(i%2==0){
                preEv+=arr[i];
            }
            else{
                preOd+=arr[i];
            }
            
        }
        return c;
    }
}
