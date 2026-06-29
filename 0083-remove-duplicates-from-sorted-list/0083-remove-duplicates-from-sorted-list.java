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
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null) return null;
        ListNode t=head.next;
        ListNode prev=head;

        while(t!=null)
        {
            if(prev.val!=t.val)
            {
                prev.next=t;
                prev=t;
            }
            t=t.next;
        }
        prev.next=null;
        return head;
    }
}