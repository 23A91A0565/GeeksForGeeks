class Solution {
    public int totalWays(int[] arr, int target) {
        // code here
        HashMap<String,Integer> ans=new HashMap<>();
        return solve(arr,target,0,0,ans);
    }
    public int solve(int arr[],int target,int sum,int index,HashMap<String,Integer> ans){
        if(index==arr.length){
            if(sum==target)return 1;
            return 0;
        }
        String key=index+","+sum;
        if(ans.containsKey(key))
            return ans.get(key);
            
        int add=solve(arr,target,sum+arr[index],index+1,ans);
        int sub=solve(arr,target,sum-arr[index],index+1,ans);
        
        ans.put(key,add+sub);
        
        return add+sub;
    }
}