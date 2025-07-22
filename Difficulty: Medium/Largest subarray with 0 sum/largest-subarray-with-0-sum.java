class Solution {
    int maxLength(int arr[]) {
        // code here
        int sum =0;
        int max=0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            
            sum += arr[i];
            
            if(sum == 0){
                max=Math.max(i+1,max);
            }

            if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else{
            map.put(sum, i);
            }        
        }
        
        return max;
    }
}