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
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root, 0, false);
    }
    
    public int dfs(TreeNode node, int sum, boolean isLeft){
        if(node == null) return 0;
        if(node.left == null && node.right == null && isLeft) sum += node.val;
        sum += dfs(node.left, sum, true) + dfs(node.right, sum, false);
        return sum;
    }
}