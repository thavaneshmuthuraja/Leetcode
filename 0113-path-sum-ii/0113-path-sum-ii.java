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

    List<List<Integer>> res=new ArrayList<>();

    void func(TreeNode root,int target,ArrayList<Integer> temp,int sum)
    {
        if(root==null) return ;

        temp.add(root.val);
        sum+=root.val;

        if(root.left==null && root.right==null) 
        {
            if(target==sum) 
            {
                res.add(new ArrayList<>(temp));
            }

        }

        func(root.left,target,temp,sum);
        func(root.right,target,temp,sum);

        temp.remove(temp.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int target) {

        func(root,target,new ArrayList<>(),0);

        return res;
        
    }
}