class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            int num = arr[i % n];
            while (!st.isEmpty() && st.peek() <= num) {
                st.pop();
            }
            if (i < n) {
                if (!st.isEmpty()) {
                    res[i] = st.peek();
                }
            }
            
            st.push(num);
        }
        
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int val : res) {
            resultList.add(val);
        }
        
        return resultList;
    }
}