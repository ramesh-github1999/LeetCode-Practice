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
    int cnt=0;
    
    bool checkPalindrome(vector<int>&mp){
        int odd=0;
        for(auto it:mp){
            if(it%2!=0) odd++;
            if(odd>1) return false;
        }
        return true;
    }
    
    void fun(TreeNode *root, vector<int>&mp){
        if(root==NULL) {
            return;
        }
         mp[root->val]++;
        if(!root->left && !root->right) {
            if(checkPalindrome(mp)) cnt++;
             mp[root->val]--;
            return;
        }
      if(root->left)  fun(root->left,mp);
      if(root->right)  fun(root->right,mp);
        mp[root->val]--;
    
    }
    int pseudoPalindromicPaths (TreeNode* root) {
        vector<int>mp(10,0);
        fun(root,mp);
        return cnt;
    }
};