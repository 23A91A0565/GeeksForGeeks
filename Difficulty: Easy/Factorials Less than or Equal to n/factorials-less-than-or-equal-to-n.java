// User function Template for Java
class Solution {
    static long facto(long n) {
        if(n==1) return 1;
        return n*facto(n-1);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> factoArr = new ArrayList<Long>();
        for(long i=1; i<=n; i++) {
            if(facto(i)<=n){
                factoArr.add(facto(i));
            }
            else{
                break;
            }
        }
        return factoArr; 
    }
}