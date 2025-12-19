class Solution {
    public int findMoves(int[] chairs, int[] passengers) {
        // code here
        int c=0;
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        for(int i=0;i<chairs.length;i++){
            c+=Math.abs(passengers[i]-chairs[i]);
        }
        return c;
    }
    
}
