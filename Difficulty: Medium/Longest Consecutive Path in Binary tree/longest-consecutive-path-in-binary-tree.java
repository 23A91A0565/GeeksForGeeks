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
        ans=1;
        solve(root,1);
        return ans==1?-1:ans;
    }
    public static void solve(Node root,int len){
        if(root==null)return;
        
        ans=Math.max(ans,len);
        if(root.left!=null){
            if(root.data+1==root.left.data)
                solve(root.left,1+len);
            else
                solve(root.left,1);
        }
        if(root.right!=null){
            if(root.data+1==root.right.data)
                solve(root.right,len+1);
            else
                solve(root.right,1);
        }
    }
}