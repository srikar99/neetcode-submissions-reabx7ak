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
    public int goodNodes(TreeNode root) {
        return bfs(root, root.val);
    }

    private int bfs(TreeNode node, int maxVal) {
       Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

       q.offer(new Pair<>(node, Integer.MIN_VALUE));
        int res = 0;

       while(!q.isEmpty()) {
            Pair<TreeNode, Integer> p = q.poll();

            TreeNode curr = p.getKey();
            int maxOnPath = p.getValue();

            TreeNode left = curr.left;
            TreeNode right = curr.right;

            if(curr.val >= maxOnPath) {
                res++;
            }


            if (left != null) q.offer(new Pair(left, Math.max(maxOnPath, curr.val)));
            if (right != null) q.offer(new Pair(right, Math.max(maxOnPath, curr.val)));
       }

       return res;
    }
}
