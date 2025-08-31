/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        if(head==null)return null;
        Node temp=head;
        for(int i=0;i<p;i++){
            temp=temp.next;
        }
        Node m=new Node(x);
        m.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=m;
        }
        temp.next=m;
        m.prev=temp;
        return head;
    }
}