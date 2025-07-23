class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
          
        int n = arr.length;
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int cnt = 0;
        
        for(int num : arr){
            mp.put(num, mp.getOrDefault(num, 0) +1);
        }
        
        for(int key : mp.keySet()){
            if(mp.get(key) >  n/k){
                cnt ++;
            }
        }
        
        return cnt;
    }
}