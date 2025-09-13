/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node data=new Node(key);
        if(key<head.data){
            data.next=head;
            head=data;
        }
        else{
            Node prev=null;
            Node temp=head;
            while(temp!=null && temp.data<key){
                prev=temp;
                temp=temp.next;
            }
            prev.next=data;
            data.next=temp;
        }
        return head;
    }
}