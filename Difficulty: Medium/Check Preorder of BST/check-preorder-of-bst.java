class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int lowerBound = Integer.MIN_VALUE;

        for (int x : arr) {
            
            if (x < lowerBound) {
                return false;
            }
            
            while (!st.isEmpty() && x > st.peek()) {
                lowerBound = st.pop();
            }

            st.push(x);
        }
        return true;
    }
}