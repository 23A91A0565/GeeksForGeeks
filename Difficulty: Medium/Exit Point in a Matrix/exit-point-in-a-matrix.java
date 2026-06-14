class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int i=0,j=0;
        int x=0,y=1;
        ArrayList<Integer> ans=new ArrayList<>();
        while(i<n && j<m){
            if(mat[i][j]==0){
                if(i+x<0 || i+x>=n || j+y<0 || j+y>=m){
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
                i+=x;
                j+=y;
            }
            else{
                mat[i][j]=0;
                if(x==0 && y==1){
                    x=1;
                    y=0;
                }
                else if(x==1 && y==0){
                    x=0;
                    y=-1;
                }
                else if(x==0 && y==-1){
                    x=-1;
                    y=0;
                }
                else{
                    x=0;
                    y=1;
                }
                if(i+x<0 || i+x>=n || j+y<0 || j+y>=m){
                    ans.add(i);
                    ans.add(j);
                    return ans;
                }
                i+=x;
                j+=y;
            }
            
        }
        return ans;
    }
}