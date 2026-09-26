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
    public ListNode Middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next== null) return head;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode middle=Middle(head);
        ListNode reversed=reverse(middle.next);
        middle.next=null;
         
        ListNode temp=head;
        ListNode temp1=reversed;

        while(temp1!=null){
           ListNode front1 = temp.next;
            ListNode front2 = temp1.next;

            temp.next = temp1;
            temp1.next = front1;

            temp = front1;
            temp1 = front2;
        
        }


       
        
        
    }
}