class Solution {
    public int largestArea(int n, int m, int[][] arr) {
        // code here
        int k=arr.length;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[m];
        for(int i=0;i<k;i++){
            int r=arr[i][0];
            int c=arr[i][1];
            row[r-1]=true;
            col[c-1]=true;
        }
        int curr=0;
        int maxR=0;
        int maxC=0;
        for(int i=0;i<n;i++){
            if(!row[i]){
                curr++;
            }
            else{
                curr=0;
            }
            maxR=Math.max(maxR,curr);
        }
        curr=0;
        for(int i=0;i<m;i++){
            if(!col[i]){
                curr++;
            }
            else{
                curr=0;
            }
            maxC=Math.max(maxC,curr);
        }
        
        return maxR*maxC;
    }
}