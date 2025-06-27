// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        if (n==1) {
        return n+1;
        }
        n++;
        while(!isPrime(n)) {
            n++;
        }
    
        return n;
        }
     public static boolean isPrime(int num) {
        for (int i = 2; i<= Math.sqrt(num);i++) {
            if (num %i==0) {
                return false;
            }
        }
        return true;
    }
}