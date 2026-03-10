class Solution {
    public int countSubarrays(int[] arr) {
        // code here
        int n=arr.length;
        Stack<Integer> ans=new Stack<>();
        int next[]=new int[n];
        next[n-1]=n;
        ans.push(n-1);
        
        for(int i=n-2;i>=0;i--){
            while(!ans.isEmpty() && arr[ans.peek()]>=arr[i]){
                ans.pop();
            }
            
            if(!ans.isEmpty()){
                next[i]=ans.peek();
            }
            else{
                next[i]=n;
            }
            ans.push(i);
        }
        
        int res=0;
        for(int i=0;i<n;i++){
            res+=(next[i]-i);
        }
        return res;
    }
}
