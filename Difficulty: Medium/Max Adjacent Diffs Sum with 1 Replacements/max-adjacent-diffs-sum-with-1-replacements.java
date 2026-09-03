class Solution {
    public int maxDiffSum(int[] arr) {
        // code here
        long replace=0;
        long keep=0;
        for(int i=1;i<arr.length;i++){
            long newkeep=Math.max(
                keep+(arr[i]-arr[i-1]),
                replace+Math.abs(arr[i]-1)
            );
            long newreplace=Math.max(
                keep+Math.abs(arr[i-1]-1),
                replace
            );
            keep=newkeep;
            replace=newreplace;
        }
        return (int)Math.max(keep,replace);
    }
}