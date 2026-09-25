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
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode p=dummy;

        for(int i=1;i<left;i++){
            p=p.next;

        }
        ListNode newhead=p.next;

        ListNode temp = newhead;
        for(int i=left;i<right;i++){
            temp=temp.next;


        }
        ListNode k=temp.next;
        temp.next=null;

        ListNode reversed=reverse(newhead);

        p.next=reversed;

        newhead.next=k;

        return dummy.next;



       

    }
}