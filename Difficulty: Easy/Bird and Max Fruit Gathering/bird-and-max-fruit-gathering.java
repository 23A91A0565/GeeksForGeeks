class Solution {
    public int maxFruits(ArrayList<Integer> arr, int m) {
        // code here
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=arr.get(i%arr.size());
        }
        int max=sum;
        for(int i=m;i<2*arr.size();i++){
            sum-=arr.get((i-m)%arr.size());
            sum+=arr.get(i%arr.size());
            max=Math.max(max,sum);
        }
        return max;
    }
}