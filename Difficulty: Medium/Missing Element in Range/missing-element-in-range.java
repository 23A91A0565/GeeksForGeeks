class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        HashSet<Integer> h=new HashSet<>();
        for(int ele:arr){
            h.add(ele);
        }
        for(int i=low;i<=high;i++){
            if(!h.contains(i)){
                res.add(i);
            }   
        }
        return res;
    }
}