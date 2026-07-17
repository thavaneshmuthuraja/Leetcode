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
    ListNode m(ListNode l1,ListNode l2)
    {
        ListNode dum=new ListNode(-1),t=dum;

        while(l1!=null && l2!=null)
        {
            if(l1.val>=l2.val)
            {
                dum.next=l2;
                l2=l2.next;
            }else if(l1.val<l2.val)
            {
                dum.next=l1;
                l1=l1.next;
            }
            dum=dum.next;
        }
         while(l1!=null)
         {
            dum.next=l1;
            l1=l1.next;
            dum=dum.next;
         } 

        while(l2!=null)
         {
            dum.next=l2;
            l2=l2.next;
            dum=dum.next;
         } 

         dum.next=null;

        return t.next;
    }
    ListNode middle(ListNode node)
    {
        ListNode s=node,f=node.next;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    ListNode mer(ListNode node)
    {
        if(node==null || node.next==null) 
        {
            return node;
        }
        ListNode mid=middle(node);
        ListNode l=node,r=mid.next;
        mid.next=null;
        l=mer(l);
        r=mer(r);
        return m(l,r);
    }
    public ListNode sortList(ListNode node) {
        if(node==null || node.next==null) return node;
        return mer(node);
    }
}