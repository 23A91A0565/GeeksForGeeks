class Solution {
    public int searchInsertK(int arr[], int k) {
        // code here
        int i=0;
        while(i<arr.length && arr[i]<k){
            i++;
        }
        return i;
    }
};