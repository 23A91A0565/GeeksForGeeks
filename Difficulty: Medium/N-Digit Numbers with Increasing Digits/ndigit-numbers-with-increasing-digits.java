class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(n>9)return ans;
        if(n==1)ans.add(0);
        StringBuilder sb=new StringBuilder();
        solve(0,0,n,sb,ans);
        return ans;
    }
    public static void solve(int pre,int len,int n,StringBuilder sb,ArrayList<Integer> ans){
        if(len==n){
            ans.add(Integer.parseInt(sb.toString()));
        }
        for(int i=pre+1;i<=9;i++){
            sb.append(i);
            solve(i,len+1,n,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
