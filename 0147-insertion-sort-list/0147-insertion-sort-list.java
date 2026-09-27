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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(Integer.MIN_VALUE);
        dummy.next=head;
        ListNode curr=head;
        while(curr!=null && curr.next!=null){
           if(curr.next.val>=curr.val){
            curr=curr.next;
           }
           else{
            ListNode tmp=curr.next;
            curr.next=tmp.next;
            ListNode pre=dummy;
            while(pre.next.val<tmp.val){
                pre=pre.next;
            }
            tmp.next=pre.next;
            pre.next=tmp;
           }
        }

        return dummy.next;
    }
}