class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n = arr.length;
        int mod = 1_000_000_007;

        Stack<Integer> st = new Stack<>();

        int next[] = new int[n];
        int prev[] = new int[n];

        // Next smaller element
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) next[i] = n;
            else next[i] = st.peek();

            st.push(i);
        }

        st.clear();

        // Previous smaller element
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) prev[i] = -1;
            else prev[i] = st.peek();

            st.push(i);
        }

        long res = 0;

        for(int i=0;i<n;i++){
            long left = i - prev[i];
            long right = next[i] - i;

            res = (res + (long)arr[i] * left * right) % mod;
        }

        return (int)res;
    }
}
