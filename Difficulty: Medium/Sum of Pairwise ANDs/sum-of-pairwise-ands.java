class Solution {
    public long pairAndSum(int[] arr) {
        // code here
        
        /* For any pair:

        a & b

        a bit is 1 **only if that bit is set in both a and b.

        Suppose for some bit k, there are count array elements having that bit set.

        Then the number of pairs where this bit contributes is:

        count * (count - 1) / 2

        And the contribution of this bit is:

        count * (count - 1) / 2 * (1 << k)

        So we can check every bit of every number */
        
        long ans=0;
        
        for(int bit=0;bit<31;bit++){
            
            long count=0;
            
            for(int num:arr){
                
                if((num & (1<<bit))!=0){
                    count++;
                }
            }
            
            long pairs=(count)*(count-1)/2;
            
            ans+=pairs*(1<<bit);
        }
        return ans;
    }
}