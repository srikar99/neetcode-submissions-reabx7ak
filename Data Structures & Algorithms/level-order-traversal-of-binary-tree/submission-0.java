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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null) return res;

        queue.add(root);

        while(!queue.isEmpty()) { 
            

            List<Integer> list = new ArrayList<>();

            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();

                if(node != null) {
                    list.add(node.val);
                    TreeNode left = node.left;
                    TreeNode right = node.right;

                    if(left != null) {
                        queue.add(left);
                    }

                    if(right != null) {
                        queue.add(right);
                    }
                }
            }
            
            if(list.size() > 0) {
                res.add(list);
            }
        }

        return res;
    }
}
