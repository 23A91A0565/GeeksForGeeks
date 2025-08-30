/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node add=new Node(x);
        if(head == null) return add;
        Node temp1=head;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        add.next=null;
        temp1.next=add;
        return head;
    }
}