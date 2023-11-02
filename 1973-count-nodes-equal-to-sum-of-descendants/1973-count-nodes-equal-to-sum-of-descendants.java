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
    int count=0;
    int dfs(TreeNode root){
        if(root==null) return 0;
        int leftsum=dfs(root.left);
        int rightsum=dfs(root.right);
        if(root.val==leftsum+rightsum) count++;
        return root.val+leftsum+rightsum;
    }
    public int equalToDescendants(TreeNode root) {
        dfs(root);
       return count;
    }
}