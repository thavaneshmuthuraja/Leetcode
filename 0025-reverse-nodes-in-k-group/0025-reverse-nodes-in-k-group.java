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
    ListNode func(ListNode node, int k) {
        ListNode p = null, nxt = null,cur=node;
        int cnt = 0;
        while (cnt < k && node != null) {
            nxt = node.next;
            node.next = p;
            p = node;
            node = nxt;
            cnt++;
        }
        cur.next=nxt;
        return p;
    }

    public ListNode reverseKGroup(ListNode node, int k) {
        int c = 0,c1=0;
        ListNode n=node;
        while(n!=null)
        {
            n=n.next;
            c1++;
        }
        if(c1<k) return node;

        ListNode prev = null, ans = null, ptr = null;
        while (node != null) {
            if (c % k == 0 && c1>=k) {
                ListNode t = func(node, k);
                if (ptr != null) {
                    ptr.next = t;
                    System.out.println(ptr.val);
                
                }
                ptr = node;

                if (c == 0) {
                    ans = t;
                }

                c += k;
                c1-=k;
                node = node.next;

            } else {
                c++;
                node = node.next;
            }
        }
        return ans;
    }
}