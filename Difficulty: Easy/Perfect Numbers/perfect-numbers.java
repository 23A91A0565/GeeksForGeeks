class Solution {
    static boolean isPerfect(int n) {
        // code here
        int s=0;
        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                s+=i;
                if(i!=n/i && n/i!=n)
                {
                s+=n/i;
                }
            }
        }
        return s==n;
    }
};