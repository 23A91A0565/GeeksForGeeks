class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        // code here
        ArrayList<ArrayList<Integer>> l=new ArrayList<>();
        if(word.isEmpty()){
            return l;
        }
        
        int dir[][]={{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{-1,1},{1,-1}};
        
        char first=word.charAt(0);
        int n=mat.length;
        int m=mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=first){
                    continue;
                }
                for(int k=0;k<8;k++){
                    if(matches(word,mat,i,j,dir[k][0],dir[k][1])){
                        l.add(new ArrayList<>(Arrays.asList(i,j)));
                        break;
                    }
                }
            }
        }
        return l;
    }
    public boolean matches(String word,char mat[][],int i,int j,int dir,int dic){
        int n=mat.length;
        int m=mat[0].length;
        for(int k=0;k<word.length();k++){
            if(i<0 || i>=n || j<0 || j>=m || word.charAt(k)!=mat[i][j]){
                return false;
            }
            i+=dir;
            j+=dic;
        }
        return true;
    }
};