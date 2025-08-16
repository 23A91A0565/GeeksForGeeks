class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
         int x = a, y = b;

        // GCD using Euclidean algorithm
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }

        int gcd = (a == 0) ? b : a;
        int lcm = (x * y) / gcd;

        return new int[]{lcm, gcd};
    }
}