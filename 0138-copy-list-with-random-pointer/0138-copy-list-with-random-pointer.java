/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node node) {
        Node prev=null,nnode=null,temp=node;

        Map<Node,Node> mp=new  HashMap<>();
        while(temp!=null)
        {
            Node t=new Node(temp.val,null,temp.random);

            if(temp==node)
            {
                nnode=t;
            }
            if(prev!=null)
            {
                prev.next=t;
            }
            mp.put(temp,t);
            prev=t;
            temp=temp.next;
        }
        temp=nnode;
        while(temp!=null)
        {
            if(temp.random!=null)
            {
                if(mp.containsKey(temp.random))
                {
                    temp.random=mp.get(temp.random);
                }
            }
            temp=temp.next;
        }
        return nnode;
    }
}