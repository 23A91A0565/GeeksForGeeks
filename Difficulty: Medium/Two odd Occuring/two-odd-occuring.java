class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int xor=arr[0];
        for(int i=1;i<arr.length;i++){
            xor^=arr[i];
        }
        int ele_right_bit=(xor&(xor-1))^xor;
        int b1=0;
        int b2=0;
        for(int i:arr){
            if((ele_right_bit & i) !=0){
                b1^=i;
            }
            else{
                b2^=i;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(b1);
        ans.add(b2);
        Collections.sort(ans, Collections.reverseOrder());
        return ans;
    }
}
