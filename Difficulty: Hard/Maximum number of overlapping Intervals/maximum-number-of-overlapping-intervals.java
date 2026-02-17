
class Solution {
    public static int overlapInt(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i][0]);
            max=Math.max(max,arr[i][1]);
        }
        int pre[]=new int[max+1];
        
        for(int i=0;i<n;i++){
            int a=arr[i][0];
            int b=arr[i][1];
            if(a>=0)pre[a]+=1;
            if(b<max)pre[b+1]-=1;
        }
        
        int res=0;
        for(int i=1;i<=max;i++){
            pre[i]+=pre[i-1];
            res=Math.max(res,pre[i]);
        }
        
        return res;
    }
}
