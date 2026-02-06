class Solution {
    int[] smallestDiff(int a[], int b[], int c[]) {
        // write code here
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int n=a.length;
        Integer res[]=new Integer[3];
        int i=0,j=0,k=0;
        int diff=Integer.MAX_VALUE;
        while(i<n && j<n && k<n){
            int min=Math.min(a[i],Math.min(b[j],c[k]));
            int max=Math.max(a[i],Math.max(b[j],c[k]));
            if(diff>max-min){
                diff=max-min;
                res[0]=a[i];
                res[1]=b[j];
                res[2]=c[k];
            }
            else if (diff==max-min){
                int sum=res[0]+res[1]+res[2];
                if(sum>a[i]+b[j]+c[k]){
                    res[0]=a[i];
                    res[1]=b[j];
                    res[2]=c[k];
                }
            }
            if(min==a[i]){
                i++;
            }
            else if(min==b[j]){
                j++;
            }
            else{
                k++;
            }
        }
        Arrays.sort(res,(x,y)->Integer.compare(y,x));

        return new int[]{res[0],res[1],res[2]};
    }
}
