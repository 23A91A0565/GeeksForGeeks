// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int numberofzero=0;
        int numberofones =0;
        for(int ele :arr){
            if(ele == 0) numberofzero++;
            else numberofones++;
        }
        for(int i= 0 ;i<numberofzero ;i++){
            arr[i]=0;
        }
        for(int i=numberofzero;i<arr.length;i++){
            arr[i]=1;
        }
    }
}
