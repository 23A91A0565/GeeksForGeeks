class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(0);
        int xor=0;
        int n=queries.length;
        for(int i=0;i<n;i++){
            if(queries[i][0]==0){
                ans.add(queries[i][1]^xor);
            }
            else{
                xor^=queries[i][1];
            }
        }
        for(int i=0;i<ans.size();i++){
            ans.set(i,ans.get(i)^xor);
        }
        Collections.sort(ans);
        return ans;
    }
}