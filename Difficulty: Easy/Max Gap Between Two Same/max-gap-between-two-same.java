class Solution {
    public int maxCharGap(String s) {
        // code here
        int ans=-1;
        int fre[]=new int[26];
        Arrays.fill(fre,-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int ind=c-'a';
            if(fre[ind]==-1)fre[ind]=i;
            else{
                int val=i-fre[ind]-1;
                ans=Math.max(ans,val);
            }
        }
        return ans;
    }
};