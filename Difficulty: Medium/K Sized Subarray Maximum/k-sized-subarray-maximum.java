class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> d=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            while(!d.isEmpty() && d.peekFirst()<=i-k){
                d.pollFirst();
            }
            while(!d.isEmpty() && arr[d.peekLast()]<=arr[i]){
                d.pollLast();
            }
            
            d.offerLast(i);
            if(i>=k-1){
                ans.add(arr[d.peekFirst()]);
            }
        }
        return ans;
    }
}