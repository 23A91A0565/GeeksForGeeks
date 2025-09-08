class Solution {
    public void binSort(int[] arr) {
        // code here
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c+=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i>=c){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
    }
}
