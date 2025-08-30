/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int c=1;
        while(head.next!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}