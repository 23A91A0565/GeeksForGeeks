class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int j=0;j<m;j++){
            int row=0;
            int col=j;
            while(row<n && col>=0){
                ans.add(mat[row][col]);
                row++;
                col--;
            }
        }
        
        for(int i=1;i<n;i++){
            int row=i;
            int col=m-1;
            while(row<n && col>=0){
                ans.add(mat[row][col]);
                row++;
                col--;
            }
        }
        return ans;
    }
}
