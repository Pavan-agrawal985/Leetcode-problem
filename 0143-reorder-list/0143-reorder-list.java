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
    public void reorderList(ListNode head) {
        
       
        ListNode x=head;
       

        while(x!=null && x.next!=null){
            ListNode y=x;
            while(y.next!=null &&y.next.next!=null){
                y=y.next;
            }
            if(x==y){
                break;
            }
            ListNode last=y.next;
            
            
            y.next=null;
            last.next=x.next;
            x.next=last;
            x=last.next;

        }


        
        
    }
}