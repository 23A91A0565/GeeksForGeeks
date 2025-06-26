// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>>a=new ArrayList<>();
        int left=0,right=arr.length-1;
        Arrays.sort(arr);
        while(left<right)
        {
            int s=arr[left]+arr[right];
            if(s==0)
            {
                ArrayList<Integer>n=new ArrayList<>();
                n.add(Math.min(arr[left],arr[right]));
                n.add(Math.max(arr[left],arr[right]));
                a.add(n);
                while(left<right && arr[left]==arr[left+1])
                {
                    left++;
                    
                }
                while(left<right && arr[right]==arr[right-1])
                {
                    right--;
                    
                }
                left++;
                right--;
            }
            else if(s<0)
                left++;
            else
                right--;
        }
        return a;
    }
}
