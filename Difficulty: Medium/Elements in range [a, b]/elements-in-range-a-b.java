class Solution {
    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int p[]:queries){
            int ind1=lower(arr,p[0]);
            int ind2=upper(arr,p[1]);
            ans.add(ind2-ind1);
        }
        return ans;
        
    }
    public int lower(int arr[],int ele){
        int l=0,h=arr.length;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]<ele){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
    public int upper(int arr[],int ele){
        int l=0,h=arr.length;
        while(l<h){
            int mid=l+(h-l)/2;
            if(arr[mid]<=ele){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
}
