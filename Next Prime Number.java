class Solution {
    public static int nextPrime(int n) {
        while(true)
        {
            if(isprime(i)==1)
            {
                return i;
            }
            i++;
        }
        
    }
    public static int isprime(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
}
