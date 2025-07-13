/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        // code here.
    boolean found = false;
    int n=arr.length;
      Arrays.sort(arr);
      for (int i = 0; i < n - 1; i++) {
        int l = i + 1;
        int r = n - 1;
        int x = arr[i];
        while (l < r) {
          if (x + arr[l] + arr[r] == 0) {
            l++;
            r--;
            found = true;
            break;
          } else if (x + arr[l] + arr[r] < 0)
            l++;
          else
            r--;
        }
        if (found)
          break;
      }
    return found;
    }
}