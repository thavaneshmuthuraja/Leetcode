/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean func(TreeNode r1,TreeNode r2)
    {
        if(r1==null && r2==null)
        {
            return true;
        }
        if(r1==null || r2==null) return false;

        return r1.val==r2.val && func(r1.left,r2.left) && func(r1.right,r2.right);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return func(p,q);
    }
}