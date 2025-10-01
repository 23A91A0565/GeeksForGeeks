class Solution {
    public static ArrayList<ArrayList<Integer>> uniquePerms(int[] arr) {
        // code here
        Arrays.sort(arr); 
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backtrack(arr, new boolean[arr.length], new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int[] arr, boolean[] used, List<Integer> current, ArrayList<ArrayList<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (used[i]) continue;
            
            if (i > 0 && arr[i] == arr[i - 1] && used[i - 1]) continue;
            
            current.add(arr[i]);
            
            used[i] = true;
            backtrack(arr, used, current, result);
            
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}