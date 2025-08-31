// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1;i<arr.length;i++){
            Node k=new Node(arr[i]);
            k.next=null;
            k.prev=curr;
            curr.next=k;
            curr=k;
        }
        return head;
    }
}