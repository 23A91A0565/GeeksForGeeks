// User function Template for Java

class Solution {
    public Node helper(int nums[],int low,int high){
        if(low>high) return null;
        int mid = (low+high)/2;
        
        Node root = new Node(nums[mid]);
        root.left=helper(nums,low,mid-1);
        root.right=helper(nums,mid+1,high);
        return root;
    }
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        int n = nums.length;
        return helper(nums,0,n-1);
    }
}