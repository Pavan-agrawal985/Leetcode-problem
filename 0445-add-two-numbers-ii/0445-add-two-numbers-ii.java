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
    public ListNode reverse(ListNode head){
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode L1=reverse(l1);
        ListNode L2=reverse(l2);


        ListNode temp1=L1;
        ListNode temp2=L2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
         int carry=0;
        while(temp1!=null || temp2!=null || carry !=0){
            int sum=carry;
           
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            carry=sum/10;
            int digit=sum%10;

            ListNode t=new ListNode(digit);
            temp.next=t;
            temp=temp.next;

            

        }

        

        return reverse(dummy.next);
        
    }
}