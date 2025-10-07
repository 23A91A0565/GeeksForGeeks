/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>>  al = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            for(int i=0; i<q.size(); i++)
            {
                Node node=q.poll();
                level.add(node.data);
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            al.add(level);
        }
        return al;
    }
}