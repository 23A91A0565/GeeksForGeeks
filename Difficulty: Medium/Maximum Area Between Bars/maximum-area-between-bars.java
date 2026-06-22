class Solution {
    public int maxArea(List<Integer> height) {
        // code here
        int max=Integer.MIN_VALUE;
        int l=0,r=height.size()-1;
        while(l<r){
            if(height.get(l)<=height.get(r)){
                max=Math.max(max,(r-l-1)*height.get(l));
                l++;
            }
            else{
                max=Math.max(max,(r-l-1)*height.get(r));
                r--;
            }
        }
        return max;
    }
}