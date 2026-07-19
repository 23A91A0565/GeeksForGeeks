class Solution {
    public ArrayList<Boolean> processQueries(int[] arr, int[][] queries) {
        // code here
        int n=arr.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        int pi=n-1;
        pre[n-1]=pi;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<=arr[i+1]){
                pre[i]=pre[i+1];
            }
            else{
                pi=i;
                pre[i]=pi;
            }
        }
        pi=0;
        suff[0]=pi;
        for(int i=1;i<n;i++){
            if(arr[i-1]>=arr[i]){
                suff[i]=suff[i-1];
            }
            else{
                pi=i;
                suff[i]=pi;
            }
        }
        ArrayList<Boolean> ans=new ArrayList<>();
        for(int q[]:queries){
            int l=q[0];
            int r=q[1];
            int peek=pre[l];
            if(suff[r]<=peek)ans.add(true);
            else ans.add(false);
        }
        return ans;
        
    }
}