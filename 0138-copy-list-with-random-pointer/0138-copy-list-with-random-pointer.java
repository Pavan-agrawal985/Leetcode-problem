/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // Node temp=head;
        // HashMap<Node,Node> map=new HashMap<>();
        // while(temp!=null){
        //     Node newnode=new Node(temp.val);
        //     map.put(temp,newnode);
        //     temp=temp.next;
            
            
        // }
        // temp=head;
        // while(temp!=null){
        //     Node copynode=map.get(temp);
        //     copynode.next=map.get(temp.next);
        //     copynode.random=map.get(temp.random);
        //     temp=temp.next;
        // }
        // return map.get(head);



        Node temp=head;

        while(temp!=null){
            Node newnode=new Node(temp.val);
            newnode.next=temp.next;
            temp.next=newnode;
            temp=temp.next.next;
            
        }
        temp=head;
        while(temp!=null){
            Node copynode=temp.next;
            if(temp.random!=null){
                copynode.random=temp.random.next;
            }
            else{
                copynode.random=null;
            }
            
            temp=temp.next.next;
        }
        Node dummy=new Node(-1);
        Node res=dummy;
        temp=head;
        while(temp!=null){
            res.next=temp.next;
            temp.next=temp.next.next;
            temp=temp.next;
            res=res.next;
        }

        return dummy.next;
        

        
    }
}