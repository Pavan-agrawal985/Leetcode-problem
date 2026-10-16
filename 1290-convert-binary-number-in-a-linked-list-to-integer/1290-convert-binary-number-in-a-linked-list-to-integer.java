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
    public int getDecimalValue(ListNode head) {

        ListNode temp=head;
        int count=0;

        while(temp.next!=null){
            temp=temp.next;
            count++;
           
        }


        int sum=0;

        temp=head;
        while(temp!=null){
            sum+=temp.val * Math.pow(2,count);
            count--;
            temp=temp.next;
        }

        return sum;
        
    }
}