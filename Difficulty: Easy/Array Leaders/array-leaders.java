class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int max[]=new int[arr.length];
        int m=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            m=Math.max(m,arr[i]);
            max[i]=m;
        }
        for(int i=0;i<arr.length;i++){
            if(max[i]<=arr[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
