


class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            int left = i;
            while(sum < target && left < arr.length){
                sum += arr[left];
                ++left;
            }
            if(sum == target){
                result.add(i+1);
                result.add(left);
                return result;
            }
        }
        result.add(-1);
        return result;
    }
}