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
    int cnt=0;
    int countNode(TreeNode root){
        if(root==null) return 0;
        return 1+countNode(root.left)+countNode(root.right);
    }
    int dfs(TreeNode root){
        if(root==null) return 0;
        int sum=root.val+dfs(root.left)+dfs(root.right);
        int count=countNode(root);
        if(sum/count==root.val) cnt++;
        return sum;
    }
    public int averageOfSubtree(TreeNode root) {
       int k= dfs(root);
        return cnt;
    }
}