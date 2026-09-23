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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int n=1;
        ListNode temp = head;
        while (temp.next != null) {

            temp = temp.next;
            n++;

        }
        k=k%n;
        if(k==0) return head;
        ListNode last = temp;
        last.next = head;
        
        

        int steps=n-k;
        ListNode newtail=head;

        for(int i=1; i<steps;i++){
            newtail=newtail.next;
        }
        head=newtail.next;
        newtail.next=null;

        // while (r > 0) {

        //     temp = head;
        //     while (temp.next != last) {
        //         temp = temp.next;
        //     }

        //     head = last;
        //     last = temp;
        //     r--;

        // }

        // last.next=null;

        return head;

    }
}