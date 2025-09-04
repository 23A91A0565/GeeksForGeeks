/*
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Solution {
     public boolean func(Node root) {
        if(root == null) return true;
        
        if(root.left == null && root.right == null) return true;
        
        int sum = ((root.left == null ? 0 : root.left.data) +
                (root.right == null ? 0 : root.right.data));
        
        if(root.data == sum) {
            return func(root.left) && func(root.right);
        }
        
        return false;
        
    }
    public boolean isSumProperty(Node root) {
        return func(root);
    }
}