class Solution {
    public int minProd(int[] arr) {
        // code here
        int pro=1;
        int negCount=0;
        int maxNeg=Integer.MIN_VALUE;
        boolean hasNonZero=false;
        boolean hasZero=false;
        for(int ele:arr){
            if(ele==0){
                hasZero=true;
                continue;
            }
            pro*=ele;
            if(ele!=0){
                hasNonZero=true;
            }
            if(ele<0){
                negCount++;
                maxNeg=Math.max(maxNeg,ele);
            }
            
        }
        if(!hasNonZero){
            return 0;
        }
        if(negCount%2==1){
            return pro;
        }
        if(negCount>0){
            return (int)pro/maxNeg;
        }
        if(hasZero){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int ele:arr){
            if(ele>0){
                min=Math.min(min,ele);
            }
        }
        return min;
    }
}