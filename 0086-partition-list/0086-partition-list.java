/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next ==null) return head;
        
        ListNode l1=new ListNode(-1);
        ListNode l2=new ListNode(-1);

        ListNode temp=head;
        ListNode temp1=l1;
        ListNode temp2=l2;

        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
       temp1.next=l2.next;
       temp2.next=null;

       return l1.next;
        


        

    }
}