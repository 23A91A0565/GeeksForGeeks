class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> ans=new PriorityQueue<>();
        int index=0;
        for(int i=0;i<k+1 && i<arr.length;i++){
            ans.add(arr[i]);
        }
        for(int i=k+1;i<arr.length;i++){
            arr[index++]=ans.poll();
            ans.add(arr[i]);
        }
        while(!ans.isEmpty()){
            arr[index++]=ans.poll();
        }
    }
}
