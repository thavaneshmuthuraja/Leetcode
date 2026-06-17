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
    int func(ListNode temp)
    {
        int cnt=0;
        while(temp!=null)
        {
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return null;
        }
        int len=func(head);
        k%=len;
        if(k==0)
        {
            return head;
        }
        k=len-k;
        int c=1;
        ListNode t=head;
        ListNode newHead=null;
        ListNode newTail=null;
        while(t.next!=null)
        {
            if(c==k)
            {
                newHead=t.next;
                newTail=t;
            }
            c++;
            t=t.next;
        }
        t.next=head;
        newTail.next=null;
        return newHead;
    }
}