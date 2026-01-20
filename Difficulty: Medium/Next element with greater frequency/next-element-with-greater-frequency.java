class Solution {
    public ArrayList<Integer> nextFreqGreater(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];

        res[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && freq.get(st.peek()) <= freq.get(arr[i])) {
                st.pop();
            }

            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            st.push(arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : res) ans.add(x);

        return ans;
    }
}
