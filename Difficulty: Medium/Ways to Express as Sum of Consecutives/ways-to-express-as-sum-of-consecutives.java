class Solution {
    public int getCount(int n) {
        // code here
        int res=0;
        for(int k=2;k*(k+1)/2<=n;k++){
            int val=n-(k*(k-1)/2);
            if(val>0 && val%k==0){
                res++;
            }
        }
        return res;
    }
};