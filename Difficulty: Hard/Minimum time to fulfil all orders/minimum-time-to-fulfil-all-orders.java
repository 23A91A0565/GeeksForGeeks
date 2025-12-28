class Solution {
    public int minTime(int[] ranks, int n) {
        // code here
        int low=0;
        int maxRank=0;
        for(int r:ranks){
            maxRank=Math.max(maxRank,r);
        }
        int high=maxRank*n*(n+1)/2;
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canMake(mid,n,ranks)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private boolean canMake(int time,int n,int[] rank){
        int donuts=0;
        for(int r:rank){
            // r * k * (k + 1) / 2 ≤ T
            int k=(int)((Math.sqrt(1+(8L*time)/r)-1)/2);
            donuts+=k;
            if(donuts>=n)return true;
        }
        return false;
    }
}