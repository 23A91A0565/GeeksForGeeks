class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum = 0;
        for(int i =0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        int natSum = 0;
        for(int i = 0; i <= arr.length+1; i++){
            natSum += i;
        }
        return natSum - sum; 
    }
}