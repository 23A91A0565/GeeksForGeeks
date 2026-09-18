/* The Node structure is defined as
 class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int absDiff(Node root) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        solve(root,l);
        for(int i=0;i<l.size()-1;i++){
            min=Math.min(min,l.get(i+1)-l.get(i));
        }
        return min;
    }
    public void solve(Node root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        solve(root.left,l);
        l.add(root.data);
        solve(root.right,l);
    }
}
