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
    ListNode func(ListNode node)
    {
        ListNode prev=null;
        while(node!=null)
        {
            ListNode nxt=node.next;
            node.next=prev;
            prev=node;
            node=nxt;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode node) {
        
        ListNode slow=node,fast=node;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode r=func(slow),l=node;

        while(r!=null && l!=null)
        {
            if(r.val!=l.val) return false;
            r=r.next;
            l=l.next;
        }
        return true;
    }
}