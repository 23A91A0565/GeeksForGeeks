// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int subsets=1<<arr.length;
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<subsets;i++)
        {
            int sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if((i&(1<<j))!=0)
                {
                    sum+=arr[j];
                }
            }
            l.add(sum);
        }
        return l;
    }
}