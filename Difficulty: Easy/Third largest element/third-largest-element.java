class Solution {
    int thirdLargest(int arr[]) {
        // Your code here
        if(arr.length<3){
            return -1;
        }
        else{
            Arrays.sort(arr);
            return arr[arr.length-3];
        }
    }
}