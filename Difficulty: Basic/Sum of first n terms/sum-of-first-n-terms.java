// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        int a;
        int b=0;
        for(int i=1;i<=n;i++){
            a=i*i*i;
            b=b+a;
        }
       
        return b;
    }
}