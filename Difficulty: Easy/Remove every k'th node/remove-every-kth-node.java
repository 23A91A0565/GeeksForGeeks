/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if(k==1)
        return new Node(-1);
        if(head==null || head.next==null)   
        return head;
        
        
        int count =1;
        
        Node curr=head;    
        Node prev=null;
        while(curr!=null){
            
            if(count%k==0){
                prev.next=curr.next;
                curr=prev.next;
                count++;
            }else{
                prev=curr;
                curr=curr.next;
                count++;
            }
            
        }
        
        return head;
    }
}