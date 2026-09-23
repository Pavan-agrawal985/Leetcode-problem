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

        ListNode temp = head;
        while (temp.next != null) {

            temp = temp.next;

        }
        ListNode last = temp;
        last.next = head;
        int r = k;

        while (r > 0) {

            temp = head;
            while (temp.next != last) {
                temp = temp.next;
            }

            head = last;
            last = temp;
            r--;

        }

        last.next=null;

        return head;

    }
}