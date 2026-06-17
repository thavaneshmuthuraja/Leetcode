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

    int len=0;
    ListNode rev(ListNode prev,ListNode cur)
    {
        if(cur==null)
        {
            return prev;
        }
        ListNode next=cur.next;
        cur.next=prev;
        prev=cur;
        len++;
        return rev(cur,next);
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        ListNode newHead=rev(null,head);
        k=k%len;
        if(k==0)
        {
            return rev(null,newHead);
        }
        ListNode ans1=null;
        ListNode ans2=null;
        ListNode t=newHead;
        int c=1;
        while(t!=null)
        {
            if(c==k)
            {
                ListNode v=t.next;
                t.next=null;
                ans1=rev(null,newHead);
                ans2=rev(null,v);
                break;
            }
            t=t.next;
            c++;
        }
        t=ans1;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=ans2;

        return ans1;

    }
}