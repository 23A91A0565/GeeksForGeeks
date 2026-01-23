class Solution {
    public int maxPeople(int[] arr) {
        // code here
        int n=arr.length;
        int pre[]=new int[n];
        int nex[]=new int[n];
        
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nex[i]=n-i;
            }
            else{
                nex[i]=st.peek()-i;
            }
            st.push(i);
        }
        
        st.clear();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pre[i]=i+1;
            }
            else{
                pre[i]=i-st.peek();
            }
            st.push(i);
        }
        
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,pre[i]+nex[i]-1);
        }
        return max;
    }
}
