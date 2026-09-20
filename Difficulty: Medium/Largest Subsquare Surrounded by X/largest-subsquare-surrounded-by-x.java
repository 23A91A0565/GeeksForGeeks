class Solution {
    public int largestSubsquare(char mat[][]) {
        // code here
        int n=mat.length;;
        int m=mat[0].length;
        int right[][]=new int[n][m];
        int down[][]=new int[n][m];
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(mat[i][j]=='X'){
                    right[i][j]=1;
                    down[i][j]=1;
                    
                    if(j+1<n){
                        right[i][j]+=right[i][j+1];
                    }
                    if(i+1<m){
                        down[i][j]+=down[i+1][j];
                    }
                }
            }
        }
        
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                for(int k=Math.min(n-i,m-j);k>ans;k--){
                    
                    if(right[i][j]<k || down[i][j]<k){
                        continue;
                    }
                    
                    if(right[i+k-1][j]>=k && down[i][j+k-1]>=k){
                        ans=k;
                        break;
                    }
                }
            }
        }
        return ans;
    }
};