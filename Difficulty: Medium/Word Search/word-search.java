class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(verify(mat,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean verify(char mat[][],int i,int j,String word,int k){
        if(i<0 || j<0 || i>=mat.length || j>=mat[0].length){
            return false;
        }
        
        if(mat[i][j]!=word.charAt(k)){
            return false;
        }
        
        if(k==word.length()-1){
            return true;
        }
        
        char temp=mat[i][j];
        mat[i][j]='#';
        
        boolean ans=verify(mat,i-1,j,word,k+1)||
                    verify(mat,i+1,j,word,k+1)||
                    verify(mat,i,j+1,word,k+1)||
                    verify(mat,i,j-1,word,k+1);
        
        mat[i][j]=temp;
                    
        return ans;
    }
}