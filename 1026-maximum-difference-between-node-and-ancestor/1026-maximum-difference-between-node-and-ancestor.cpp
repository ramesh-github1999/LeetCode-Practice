/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int res=0;
    void helper(TreeNode *root,int cmax,int cmin){
        if(root==NULL) return;
        res=max(res,max(abs(cmax-root->val),abs(cmin-root->val)));
        cmin=min(cmin,root->val);
        cmax=max(cmax,root->val);
        helper(root->left,cmax,cmin);
        helper(root->right,cmax,cmin);
    }
    int maxAncestorDiff(TreeNode* root) {
        helper(root,root->val,root->val);
        return res;
    }
};