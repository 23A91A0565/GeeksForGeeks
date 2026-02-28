class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        // code here
        int n=arr1.length;
        int m=arr2.length;
        int r1=0,r2=0;
        int i=0,j=m-1;
        int max=Integer.MAX_VALUE;
        while(i<n && j>=0){
            int curr=arr1[i]+arr2[j];
            if(Math.abs(curr-x)<max){
                max=Math.abs(curr-x);
                r1=arr1[i];
                r2=arr2[j];
            }
            if(curr>x){
                j--;
            }
            else{
                i++;
            }
        }
        return new ArrayList<>(Arrays.asList(r1,r2));
    }
}