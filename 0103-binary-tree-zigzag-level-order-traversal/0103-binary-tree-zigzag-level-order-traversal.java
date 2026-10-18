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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        order(result,root,0);
        return result;
    }
    public void order(List<List<Integer>> result, TreeNode root, int index) {
        if(root == null) {
            return;
        }
        if(result.size() == index) {
            result.add(new ArrayList<>());
        }
        if(index%2==0) {
            result.get(index).add(root.val);
        }
        else {
            result.get(index).add(0,root.val);
        }
        order(result,root.left, index+1);
        order(result, root.right, index+1);
    }
}