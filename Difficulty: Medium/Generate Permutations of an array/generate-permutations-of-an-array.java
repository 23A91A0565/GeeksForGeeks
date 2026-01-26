class Solution {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> st=new ArrayList<>();
        boolean curr[]=new boolean[arr.length];
        solve(arr,st,ans,curr);
        return ans;
    }
    public static void solve(int arr[],ArrayList<Integer> st,ArrayList<ArrayList<Integer>> ans,boolean curr[]){
        if(st.size()==arr.length){
            ans.add(new ArrayList<>(st));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!curr[i]){
                st.add(arr[i]);
                curr[i]=true;
                solve(arr,st,ans,curr);
                st.remove(st.size()-1);
                curr[i]=false;
            }
        }
    }
}