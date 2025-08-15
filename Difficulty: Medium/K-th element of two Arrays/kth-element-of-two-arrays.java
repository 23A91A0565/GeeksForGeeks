class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int c=0;
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j]){
                c+=1;
                if(c==k){
                    return a[i];
                }
                i++;
            }
            else{
                c+=1;
                if(c==k){
                    return b[j];
                }
                j++;
            }
        }
         while (i < n) {
            c++;
            if (c == k) return a[i];
            i++;
        }
        while (j < m) {
            c++;
            if (c == k) return b[j];
            j++;
        }
        return -1;
    }
}