class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int freq[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<=arr.length;i++){
            if(freq[i]>=2){
                res.add(i);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(freq[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}
