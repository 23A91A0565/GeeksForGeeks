// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0,c=0;
        int ind=-1;
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(arr[i][j]==1){
                    c+=1;
                }
                else{
                    break;
                }
            }
            if(c>max){
                max=c;
                ind=i;
            }
            c=0;
            
        }
        return ind;
    }
}