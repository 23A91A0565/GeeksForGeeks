class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int i=0,j=0;
        int n=arr.length;
        HashMap<Integer,Integer> ans =new HashMap<>();
        while(i<arr.length && i<k){
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
            i++;
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(ans.size());
        while(i<arr.length && j<arr.length){
            ans.put(arr[j],ans.get(arr[j])-1);
            if(ans.get(arr[j])==0){
                ans.remove(arr[j]);
            }
            j++;
            
            ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
            res.add(ans.size());
            i++;
        }
        return res;
    }
}