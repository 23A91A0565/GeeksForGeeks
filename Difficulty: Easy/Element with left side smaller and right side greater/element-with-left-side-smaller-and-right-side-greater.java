class Solution {
    public int findElement(int[] arr) {
        // code here
        int max[]=new int[arr.length];
        int min[]=new int[arr.length];
        max[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            max[i]=Math.max(arr[i],max[i-1]);   
        }
        min[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            min[i]=Math.min(arr[i],min[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            if(max[i-1]<arr[i] && min[i+1]>arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
