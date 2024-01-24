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
     int cnt = 0;

     boolean checkPalindrome(int[] mp) {
        int odd = 0;
        for (int freq : mp) {
            if (freq % 2 != 0) odd++;
            if (odd > 1) return false;
        }
        return true;
    }
    
    void fun(TreeNode root, int[] mp) {
        if (root == null) {
            return;
        }
        mp[root.val]++;
        if (root.left == null && root.right == null) {
            if (checkPalindrome(mp)) cnt++;
            mp[root.val]--;
            return;
        }
        if (root.left != null) fun(root.left, mp);
        if (root.right != null) fun(root.right, mp);
        mp[root.val]--;
    }

    
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] mp = new int[10];
        Arrays.fill(mp, 0);
        fun(root, mp);
        return cnt;
    }
}