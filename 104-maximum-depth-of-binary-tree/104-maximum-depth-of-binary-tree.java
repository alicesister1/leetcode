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
    public int maxDepth(TreeNode root) {
        return visit(root);
    }
    
    private int visit(TreeNode node) {
        int currentDepth = 0;
        if (node != null) {
            currentDepth++;
            int leftDepth = visit(node.left);
            int rightDepth = visit(node.right);
            return currentDepth + Math.max(leftDepth, rightDepth);
        }
        
        return 0;
    }
}