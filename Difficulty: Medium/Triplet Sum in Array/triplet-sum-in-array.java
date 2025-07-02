// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean hasTripletSum(int arr[], int target) {
        // Your code Here
        Arrays.sort(arr);
        for(int i =0 ; i<arr.length-2 ; i++){
            int k = i+1;
            int j = arr.length - 1;
            while (k < j) { 
                int sum = arr[i] + arr[k] + arr[j];
                
                if (sum == target) {
                    return true; 
                } else if (sum < target) {
                    k++; 
                } else {
                    j--; 
                }
            }
        }
        return false;
    }
}
