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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode temp=head;
        while(temp!=null)
        {
            int tv=temp.val;
            if(temp!=null && temp.next!=null){

                temp.val=temp.next.val;
                temp.next.val=tv;
                temp=temp.next.next;
            }else
            {
                break;
            }
        }

        return head;
    }
}