class Solution {
    public int countFriendsPairings(int n) {
        // code here
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    public int solve(int n,int dp[]){
        if(n<=2)return n;
        if(dp[n]!=-1)return dp[n];
        // if he don not paired with anyone we ned to arrange remaining n-1 friends
        int single=solve(n-1,dp);
        // if he paired with anyone then he need have (n-1) pairs and need to arrange
        // remainiing n-2 friends
        int paired=(n-1)*solve(n-2,dp);
        return dp[n]=single+paired;
    }
}
