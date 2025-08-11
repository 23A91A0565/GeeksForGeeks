class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        Stack<Integer> st1 =new Stack<Integer>();
         ArrayList<Integer> a1 =new ArrayList<Integer>();
         for(int i=0;i<arr.length;i++)
         {
             while(st1.isEmpty()==false&&st1.peek()>=arr[i])
             {
                 st1.pop();
             }
             int val=(st1.isEmpty())?-1:st1.peek();
             a1.add(val);
             st1.push(arr[i]);         
         }
         int []ans =new int[a1.size()];
         for(int i=0;i<ans.length;i++)
         {
           ans[i]=a1.get(i);
         }
         return ans;
    }
}
