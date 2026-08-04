class Solution {
    public static int countPairs(int arr[], int k) {
        // code here
        int res=0;
        Arrays.sort(arr);
        int i=0;
        int j=i+1;
        while(i<arr.length && j<arr.length){
            if(Math.abs(arr[i]-arr[j])<k){
                res+=j-i;
                j++;
            }
            else{
                i++;
            }
        }
        return res;
    }
}
