/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        // code here
        if(head==null || head.next==null)return head;
        Stack<Node> st=new Stack<>();
        Node curr=head;
        while(curr!=null){
            while(!st.empty() && st.peek().data<curr.data){
                st.pop();
            }
            st.push(curr);
            curr=curr.next;
        }
        Node res=null;
        while(!st.empty()){
            Node temp=st.pop();
            if(res==null){
                res=temp;
            }
            else{
                temp.next=res;
                res=temp;
            }
        }
        return res;
        
    }
}