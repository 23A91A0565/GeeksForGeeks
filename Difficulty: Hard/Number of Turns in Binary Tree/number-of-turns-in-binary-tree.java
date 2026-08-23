/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public int numberOfTurns(Node root, int p, int q) {
        // code here
        StringBuilder path1=new StringBuilder();
        StringBuilder path2=new StringBuilder();
        
        findPath(root,p,path1);
        findPath(root,q,path2);
        
        int i = 0;
        while (i < path1.length() && i < path2.length()
                && path1.charAt(i) == path2.charAt(i)) {
            i++;
        }

        StringBuilder path = new StringBuilder();
        
        for (int j = path1.length() - 1; j >= i; j--) {
            path.append(path1.charAt(j));
        }

        for (int j = i; j < path2.length(); j++) {
            path.append(path2.charAt(j));
        }

        int turns = 0;

        for (int j = 1; j < path.length(); j++) {
            if (path.charAt(j) != path.charAt(j - 1)) {
                turns++;
            }
        }

        return turns == 0 ? -1 : turns;
        
    }
    private boolean findPath(Node root, int target, StringBuilder path) {
        if (root == null) return false;

        if (root.data == target) return true;

        path.append('L');
        if (findPath(root.left, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        path.append('R');
        if (findPath(root.right, target, path)) {
            return true;
        }
        path.deleteCharAt(path.length() - 1);

        return false;
    }
}