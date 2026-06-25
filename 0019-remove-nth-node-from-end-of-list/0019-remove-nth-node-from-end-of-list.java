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
        int cnt=0;
        ListNode t=head;
        while(t!=null)
        {
            t=t.next;
            cnt++;
        }
        t=head;

        if(cnt==n) return head.next;
        
        while(t!=null)
        {
            if(cnt-1==n)
            {
                t.next=t.next!=null ? t.next.next:null;
            }
            cnt--;
            t=t.next;
        }

        return head;
    }
}