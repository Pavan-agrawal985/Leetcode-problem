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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            
            count++;
            temp=temp.next;
        }

        if (n == count) {
        return head.next;
    }

        int rn=count-n;

        temp=head;
        int k=1;
        while(k<rn){
            temp=temp.next;
            k++;
        }
        temp.next=temp.next.next;
         return head;

        
    }
}