class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<n;i++){
            if(seen.contains(arr[i])){
                res.add(arr[i]);
            }
            else{
                seen.add(arr[i]);
            }
        }
        for(int i=1;i<=n;i++){
            if(!seen.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
