// User function Template for Java

class Solution {
    static int adjacentPairs(int arr[]) {
        // code here
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==1)
            {
                c+=1;
            }
        }
        return c;
    }
}