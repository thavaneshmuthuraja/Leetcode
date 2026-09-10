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
    class Pair{
        int value,cnt;
        Pair(int v,int c)
        {
            value=v;
            cnt=c;
        }
    }
    int ans=0;
    Pair post(TreeNode root)
    {
        if(root==null)
        {
            return new Pair(0,0);
        }
        int c=1;

        Pair left=post(root.left);
        Pair right=post(root.right);
        int v=root.val+left.value+right.value;
        c+=left.cnt+right.cnt;
        if((v/c)==root.val) ans++;
        return new Pair(v,c);
    }
    public int averageOfSubtree(TreeNode root) {
        post(root);
        return ans;
    }
}