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
    List<Integer> result = new ArrayList<Integer>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        printInOrder(root);
        return result;
    }
    
    public void printInOrder(TreeNode Node) {
        if(Node == null) return;
        printInOrder(Node.left);
        result.add(Node.val);
        printInOrder(Node.right);
        return;
    }
}