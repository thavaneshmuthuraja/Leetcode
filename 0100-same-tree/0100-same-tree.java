class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> p1 = new LinkedList<>();

        q1.offer(q);
        p1.offer(p);

        while (!q1.isEmpty() && !p1.isEmpty()) {

            TreeNode n1 = q1.poll();
            TreeNode n2 = p1.poll();

            if (n1 == null && n2 == null)
                continue;

            if (n1 == null || n2 == null)
                return false;

            if (n1.val != n2.val)
                return false;

            q1.offer(n1.left);
            p1.offer(n2.left);

            q1.offer(n1.right);
            p1.offer(n2.right);
        }

        return q1.isEmpty() && p1.isEmpty();
    }
}