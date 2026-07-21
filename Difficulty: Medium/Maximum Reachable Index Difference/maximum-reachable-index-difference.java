class Solution {
    public int maxIndexDifference(String s) {
        // code here
        int n=s.length();
        int dp[]=new int[n];
        int best[]=new int[26];
        int ans=-1;
        
        Arrays.fill(best,-1);
        
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='z'){
                dp[i]=i;
            }
            else{
                int nxt=best[c-'a'+1];
                if(nxt==-1){
                    dp[i]=i;
                }
                else{
                    dp[i]=dp[nxt];
                }
            }
            
            int curr=c-'a';
            
            if(best[curr]==-1 || dp[i]>dp[best[curr]]){
                best[curr]=i;
            }
            if(c=='a'){
                ans=Math.max(ans,dp[i]-i);
            }
        }
        return ans;
    }
}