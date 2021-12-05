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
 
**** Normal bfs traversal
class Solution {
    public int rob(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> levelQ = new LinkedList<Integer>();
        int sumOdd = 0, sumEven = 0;
        q.add(root);
        levelQ.add(1);
        
        return bfs(q, levelQ, sumOdd, sumEven);
    }
    
    private int bfs(Queue<TreeNode> q, Queue<Integer> levelQ, int sumOdd, int sumEven) {
        // Base case
        if (q.peek() == null) return Math.max(sumOdd, sumEven);
        
        TreeNode node = q.poll();
        int level = levelQ.poll();
        
        // Add to sum for current level
        if (level % 2 == 1)
            sumOdd += node.val;
        else
            sumEven += node.val;
        
        // Add the childs and levels to the queue
        if (node.left != null) {
            q.add(node.left);
            levelQ.add(level + 1);
        }
        if (node.right != null) {
            q.add(node.right);
            levelQ.add(level + 1);
        }
        
        // Continue with the next bfs
        return bfs(q, levelQ, sumOdd, sumEven);
    }
}
*/

class Solution {
    public int rob(TreeNode root) {
        int ans[] = robHouse(root);
        return Math.max(ans[0],ans[1]);
    }
    
    public int[] robHouse(TreeNode root){
        if(root==null){
            return new int[2];
        }
        
        int left[] = robHouse(root.left);
        int right[] = robHouse(root.right);
        
        int ans[] = new int[2];
        
        ans[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        ans[1] = root.val+left[0]+right[0];
        
        return ans;
    }
}