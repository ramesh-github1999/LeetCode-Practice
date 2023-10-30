class Solution {
public:
    vector<int> maxSubsequence(vector<int>& nums, int k) {
        
        vector<int>nums2=nums,ans;
        sort(nums2.begin(),nums2.end());
       for(int i=nums2.size()-k;i<nums2.size();i++) ans.push_back(nums2[i]);
        vector<int>res;
        for(int i=0;i<nums.size();i++){
             auto it = find(ans.begin(), ans.end(),nums[i]);
             if (it != ans.end()) {
              res.push_back(nums[i]);
              ans.erase(it);
             }
        }
    
        return res;
    }
};