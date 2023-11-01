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
     Map<Integer,Integer>mp=new HashMap<>();
    void inorder(TreeNode root){
        if(root==null) return;
         mp.put(root.val,mp.getOrDefault(root.val,0)+1);
        inorder(root.left);
        inorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int maxi=0;
        for (int i:mp.values()) {
            maxi=Math.max(maxi,i);
        }
        List<Integer> l=new ArrayList<>();
        for(int i:mp.keySet()) {
            int val=mp.get(i);
            if(val==maxi) l.add(i);
        }
        int [] ans=new int[l.size()];
        int k=0;
        for(int i=0;i<l.size();i++) ans[k++]=l.get(i);
        return ans;
    }
}