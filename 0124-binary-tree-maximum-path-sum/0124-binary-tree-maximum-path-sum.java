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
    int ans=-10000;

    int func(TreeNode root)
    {
        if(root==null) return 0;

        int l=func(root.left);
        int r=func(root.right);
        if(l<0) l=0;
        if(r<0) r=0;
        ans=Math.max(ans,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
    public int maxPathSum(TreeNode root) {
        func(root);
        return ans;
    }
}