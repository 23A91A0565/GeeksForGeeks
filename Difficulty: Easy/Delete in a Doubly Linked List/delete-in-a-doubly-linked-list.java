/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if (head.next==null && x==1) return null;
        if(x==1){
            head = head.next;
            if(head!=null){
                head.prev=null;
            }
            return head;
        }
        int count = 1;
        Node temp=head;
        while(temp!=null){
            if(count==x){
                temp.prev.next = temp.next;
                if(temp.next!=null) temp.next.prev=temp.prev;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }
}