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
    boolean ans=true;
    int func(TreeNode root)
    {
        if(!ans) return 0;
        if(root==null) return 0;
        int l=func(root.left);
        int r=func(root.right);
        if(Math.abs(l-r)>1) ans=false;
        return Math.max(l+1,r+1);

    }
    public boolean isBalanced(TreeNode root) {
        func(root);
        return ans;
    }
}