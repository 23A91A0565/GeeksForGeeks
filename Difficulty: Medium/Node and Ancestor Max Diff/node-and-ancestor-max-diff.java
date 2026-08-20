/* Structure of binary tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int res=Integer.MIN_VALUE;
    int maxDiff(Node root) {
        //  code here
        solve(root,root.data);
        return res;
    }
    public void solve(Node root,int max){
        if(root==null)return;
        if(root.left!=null){
            int val=root.left.data;
            res=Math.max(res,max-val);
            solve(root.left,Math.max(max,val));
        }
        if(root.right!=null){
            int val=root.right.data;
            res=Math.max(res,max-val);
            solve(root.right,Math.max(max,val));
        }
    }
}