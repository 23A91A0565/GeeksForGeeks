/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int l=0,r=a.length-1;
        while(l<r){
           int mid=(r-l)/2+l;
           if(a[mid]==b[mid])l=mid+1;
            else r=mid;
        }
        return l;
    }
}