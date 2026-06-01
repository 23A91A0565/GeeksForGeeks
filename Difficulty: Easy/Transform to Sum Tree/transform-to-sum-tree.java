/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public void toSumTree(Node root) {
        // code here
        solve(root);
    }
    public int solve(Node root){
        if(root==null)return 0;
        int left=solve(root.left);
        int right=solve(root.right);
        int data=root.data;
        root.data=left+right;
        return data+root.data;
    }
}