class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int j=0,n=arr.length;
        int i=0;
        while(i<n){
            int noele=1<<j;
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for(int k=i;k<Math.min(n,i+noele);k++){
                pq.add(arr[k]);
            }
            ArrayList<Integer> st=new ArrayList<>();
            while(!pq.isEmpty()){
                int ele=pq.poll();
                st.add(ele);
            }
            ans.add(st);
            j++;
            i+=noele;
        }
        return ans;
    }
}