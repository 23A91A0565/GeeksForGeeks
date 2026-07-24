/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    static int ans;
    public int longestConsecutive(Node root) {
        // code here
        if(root==null)return -1;
        ans=0;
        solve(root);
        return ans==1?-1:ans;
    }
    public static int solve(Node root){
        if(root==null)return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        
        int len=1;
        if(root.left!=null && root.data+1==root.left.data){
            len=Math.max(len,1+left);
        }
        if(root.right!=null && root.data+1==root.right.data){
            len=Math.max(len,1+right);
        }
        ans=Math.max(ans,len);
        return len;
    }
}