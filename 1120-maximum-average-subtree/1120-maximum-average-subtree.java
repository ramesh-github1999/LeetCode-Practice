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
    double maxi=0;
    public double maximumAverageSubtree(TreeNode root) {
         dfs(root);
          return maxi;
    }
     
    double[] dfs(TreeNode root) {
        if(root==null) return new double[]{0.0,0.0};
           double []left=dfs(root.left);
           double [] right=dfs(root.right);
           double sum=root.val+left[0]+right[0];
           double totalNode=1+left[1]+right[1];
           maxi=Math.max(maxi,sum/totalNode);
           return new double[]{sum,totalNode};
    }
}
