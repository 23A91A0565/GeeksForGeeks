class Solution {
    public void segregateElements(int[] arr) {
        ArrayList<Integer> ar1 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                ar1.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                ar1.add(arr[i]);
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = ar1.get(i);
        }
    }
}
