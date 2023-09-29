class Solution {
public:
    vector<int> minSubsequence(vector<int>& nums) {
        sort(nums.rbegin(),nums.rend());
        int sum=0;
        for(int i=0;i<nums.size();i++) sum+=nums[i];
        int csum=0;
        int idx=-1;
        for(int i=0;i<nums.size();i++){
            csum+=nums[i];
           int rsum=sum-csum;
            if(csum>rsum) {
                idx=i;
                break;
            }
        }
        vector<int>ans;
        for(int i=0;i<=idx;i++) ans.push_back(nums[i]);
        return ans;
        
    }
};