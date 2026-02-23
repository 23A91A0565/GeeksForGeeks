class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
        for(int ele:set){
            ans.add(ele);
        }
        return ans;
    }
}