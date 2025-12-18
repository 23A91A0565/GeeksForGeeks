class Solution {
    public void sortIt(int[] arr) {
        // code here
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for(int ele:arr){
            if(ele%2!=0){
                odd.add(ele);
            }
            else{
                even.add(ele);
            }
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        
        int x=0;
        for(int ele:odd)arr[x++]=ele;
        for(int ele:even)arr[x++]=ele;
    }
}
