/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Node temp=root;
        while(temp!=null){
            ans.add(temp.data);
            if(temp.bottom!=null){
                Node bot=temp.bottom;
                while(bot!=null){
                    ans.add(bot.data);
                    bot=bot.bottom;
                }
            }
            temp=temp.next;
        }
        Collections.sort(ans);
        Node head=new Node(ans.get(0));
        Node temp2=head;
        for(int i=1;i<ans.size();i++){
            temp2.bottom=new Node(ans.get(i));
            temp2=temp2.bottom;
        }
        return head;
    }
}