/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) {
        Map<ListNode,Integer> mp=new HashMap<>();
        while(a!=null || b!=null)
        {
            
            if(b!=null){
            if(mp.containsKey(b)) return b;
            else mp.put(b,b.val);
            b=b.next;
            }

            if(a!=null){
            if(mp.containsKey(a)) return a;
            else mp.put(a,a.val);
            a=a.next;
            }
        }
        return null;
    }
}