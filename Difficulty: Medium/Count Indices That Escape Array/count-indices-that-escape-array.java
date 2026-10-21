class Solution {
    public int goodIndices(int[] arr) {
        // code here
        int n=arr.length;
        int phase[]=new int[n];
        int c=0;
        
        for(int i=0;i<n;i++){
            if(phase[i]==0)solve(i,n,arr,phase);
            if(phase[i]==2)c++;
        }
        
        return c;
    }
    public boolean solve(int i,int n,int arr[],int phase[]){
        if(i<0 || i>=n || phase[i]==2)return true;
        
        if(phase[i]==1)return false;
        
        phase[i]=1;
        
        boolean check=solve(i+arr[i],n,arr,phase);
        
        if(check){
            phase[i]=2;
        }
        
        return check;
    }
}