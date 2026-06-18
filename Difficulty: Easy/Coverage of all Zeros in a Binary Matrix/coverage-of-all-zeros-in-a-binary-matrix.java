class Solution {
    public int findCoverage(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int res=0;
        
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=0;j<m;j++){
                if(mat[i][j]==0){
                    if(found)res++;
                }
                else{
                    found=true;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            boolean found=false;
            for(int j=m-1;j>=0;j--){
                if(mat[i][j]==0){
                    if(found)res++;
                }
                else{
                    found=true;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=0;j<n;j++){
                if(mat[j][i]==0){
                    if(found)res++;
                }
                else{
                    found=true;
                }
            }
        }
        
        for(int i=0;i<m;i++){
            boolean found=false;
            for(int j=n-1;j>=0;j--){
                if(mat[j][i]==0){
                    if(found)res++;
                }
                else{
                    found=true;
                }
            }
        }
        
        return res;
    }
}