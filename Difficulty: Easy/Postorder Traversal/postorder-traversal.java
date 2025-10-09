/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        traverse(ans,root);
        return ans;
    }
    public static void traverse(ArrayList<Integer> ans,Node root){
        if(root==null){
            return;
        }
        traverse(ans,root.left);
        traverse(ans,root.right);
        ans.add(root.data);
    }
}