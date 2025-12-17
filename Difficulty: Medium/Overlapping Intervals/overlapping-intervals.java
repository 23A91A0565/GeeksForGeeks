class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> ans=new ArrayList<>();
        int l=arr[0][0];
        int r=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>r){
                ans.add(new int[]{l,r});
                l=arr[i][0];
                r=arr[i][1];
            }
            else{
                r=Math.max(arr[i][1],r);
            }
        }
        ans.add(new int[]{l,r});
        return ans;
    }
}