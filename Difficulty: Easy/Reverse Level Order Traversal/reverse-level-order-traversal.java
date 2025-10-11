/*
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

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        // code here
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> res=new Stack<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size > 0){
                Node temp = q.poll();
                res.push(temp.data);
                
                if(temp.right!=null) q.add(temp.right);
                if(temp.left!=null) q.add(temp.left);
                size--;
            }
        }
        while(!res.isEmpty()){
            ans.add(res.pop());
        }
        return ans;
    }
}