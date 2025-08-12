// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int floor=-1,ceil=Integer.MAX_VALUE;
        for(int i : arr){
            if(x>=i) floor = Math.max(i,floor);
            if(x<=i) ceil = Math.min(i,ceil);
        }
        if(ceil == Integer.MAX_VALUE) ceil=-1;
        return new int[]{floor,ceil};
    }
}
