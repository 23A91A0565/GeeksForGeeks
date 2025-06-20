class Solution {
    public static long sumOfDivisors(long n) {
        int sum=0;
        if(n==1)
            return 1;
            
            for(int x=1;x<=n;x++)
            {
                for(int y=1;y<=x;y++)
                {
                    if(x%y==0)
                    sum+=y;
                }
            }  
        return sum;
        
    }
}
