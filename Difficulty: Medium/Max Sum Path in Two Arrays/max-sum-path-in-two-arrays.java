class Solution {
    public int maxPathSum(int[] a, int[] b) {
        // code here
        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        int sumA=0,sumB=0;
        int ans=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                sumA+=a[i];
                i++;
            }
            else if(b[j]<a[i]){
                sumB+=b[j];
                j++;
            }
            else{
                ans=Math.max(ans+sumA+a[i],ans+sumB+b[j]);
                sumA=0;
                sumB=0;
                i++;
                j++;
            }
        }
        while(i<n){
            sumA+=a[i];
            i++;
        }
        while(j<m){
            sumB+=b[j];
            j++;
        }
        return Math.max(ans+sumA,ans+sumB);
    }
}