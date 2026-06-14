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

    public ListNode rev(ListNode prev,ListNode cur)
    {
        if(cur==null)
        {
            return prev;
        }
        ListNode nxt=cur.next;
        cur.next=prev;
        prev=cur;

        return rev(cur,nxt);
    }

    public int pairSum(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;


        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;

            fast=fast.next.next;
        }

        ListNode rh=rev(null,slow);
        int ans=0;
        ListNode temp=head;

        while(rh!=null)
        {
            ans=Math.max(ans,temp.val+rh.val);
            temp=temp.next;
            rh=rh.next;
        }

        return ans;      
    }
}