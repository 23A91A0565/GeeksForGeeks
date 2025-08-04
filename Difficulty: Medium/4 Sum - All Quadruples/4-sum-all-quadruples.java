class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue; 

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue; 

                int start = j + 1;
                int end = n - 1;

                while (start < end) {
                    long sum = (long) arr[i] + arr[j] + arr[start] + arr[end];

                    if (sum == target) {
                        ArrayList<Integer> l = new ArrayList<>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[start]);
                        l.add(arr[end]);
                        ans.add(l);
                        
                        while (start < end && arr[start] == arr[start + 1]) start++;
                        while (start < end && arr[end] == arr[end - 1]) end--;

                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return ans;
    }
}
