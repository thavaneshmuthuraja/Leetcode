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

    Map<Long,Integer>mp=new HashMap<>();

    int ans=0;


    void func(TreeNode root,int target,long sum)
    {
        if(root==null) return;

        sum+=root.val;


        if(sum-target==0) ans++;

        if(mp.containsKey(sum-target))
        {
            ans+=mp.get(sum-target);
        }

        mp.put(sum,mp.getOrDefault(sum,0)+1);

        func(root.left,target,sum);

        func(root.right,target,sum);

        mp.put(sum,mp.getOrDefault(sum,1)-1);
        if(mp.get(sum)==0) mp.remove(sum);

    }


    public int pathSum(TreeNode root, int target) {



        func(root,target,0);

        return ans;
        
    }
}