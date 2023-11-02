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
     int [] fun(TreeNode root){
         if(root==null) return new int[]{0,0};
        int []left=fun(root.left);
        int [] right=fun(root.right);
        int sum=root.val+left[0]+right[0];
        int totalCount=1+left[1]+right[1];
        if(sum/totalCount==root.val) count++;
        return new int[] {sum,totalCount};
     }
    public int averageOfSubtree(TreeNode root) {
       fun(root);
        return count;
    }
}