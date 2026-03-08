class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        HashSet<Integer> ans=new HashSet<>();
        for(int ele:arr){
            ans.add(ele*ele);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(ans.contains(arr[i]*arr[i] + arr[j]*arr[j]))return true;
            }
        }
        return false;
    }
}