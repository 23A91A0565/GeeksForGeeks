class Solution {
    public int solve(int n, String s) {
        // code here
        int av[]=new int[26];
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(av[c-'A']==0){
                if(n>0){
                    av[c-'A']=1;
                    n--;
                }
                else{
                    av[c-'A']=2;
                    ans++;
                }
            }
            else{
                if(av[c-'A']==1){
                    n++;
                    av[c-'A']=0;
                }
            }
        }
        return ans;
    }
}
