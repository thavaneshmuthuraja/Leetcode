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

    void level(TreeNode root,List<List<Integer>>ans,int l)
    {
        if(root==null) return;
        if(ans.size()==l) ans.add(new ArrayList<>());
        ans.get(l).add(root.val);
        level(root.left,ans,l+1);
        level(root.right,ans,l+1);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        level(root,ans,0);
        return ans;
    }
}