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
    public ListNode reverse (ListNode Head){
        ListNode prev=null;
        ListNode temp=Head;

        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;


    }
    public boolean isPalindrome(ListNode head) {

        ListNode slow =head;
        ListNode fast =head;

        while(fast.next !=null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode secondhead=reverse(slow.next);

        boolean flag=true;

        ListNode first=head;
        ListNode second=secondhead;

        while(second!=null){
            if(first.val !=second.val){
                flag=false;
                return flag;
            }
            first=first.next;
            second=second.next;
        }
        slow.next=reverse(secondhead);
        return flag;
        
    }
}