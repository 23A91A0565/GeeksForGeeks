/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Node cur=head;
        HashSet<Integer> vis=new HashSet<>();
        vis.add(cur.data);
        while(cur.next!=null)
        {
            if(vis.contains(cur.next.data))
            {
                cur.next=cur.next.next;
            }
            else{
                vis.add(cur.next.data);
                cur=cur.next;
            }
            
        }
        return head;
    }
}