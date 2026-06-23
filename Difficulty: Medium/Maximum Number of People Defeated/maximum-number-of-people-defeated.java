class Solution {
    int maxPeopleDefeated(int p) {
        // code here
        long l=1,h=10000;
        long ans=0;
        while(l<=h){
            long mid=(l+h)/2;
            long val=(mid*(mid+1)*(2*mid+1))/6;
            if(val<=p){
                ans=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return (int)ans;
    }
};