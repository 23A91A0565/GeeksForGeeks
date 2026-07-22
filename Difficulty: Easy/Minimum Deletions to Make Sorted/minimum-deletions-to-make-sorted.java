class Solution {
    public int minDeletions(int[] arr) {
        // code here
        List<Integer> l=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ind=find(l,arr[i]);
            if(ind==l.size()){
                l.add(arr[i]);
            }
            else{
                l.set(ind,arr[i]);
            }
        }
        return n-l.size();
    }
    public static int find(List<Integer> lis,int ele){
        int l=0,r=lis.size();
        while(l<r){
            int mid=(l+r)/2;
            if(lis.get(mid)<ele){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}