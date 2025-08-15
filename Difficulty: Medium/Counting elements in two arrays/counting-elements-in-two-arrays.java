class Solution {
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        Arrays.sort(b);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int l=0;
            int h=b.length;
            while(l<h)
            {
                int mid=(l+h)/2;
                if(b[mid]>a[i]){
                    h=mid;
                }
                else{
                    l=mid+1;
                }
            }
            ans.add(l);
        }
        return ans;
    }
}