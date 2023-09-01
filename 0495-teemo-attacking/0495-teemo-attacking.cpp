class Solution {
public:
    int findPoisonedDuration(vector<int>& nums, int d) {
        int ans=0;
        int n=nums.size();
        for(int i=0;i<nums.size()-1;i++){
            ans+=min(d,(d-(d+nums[i]-nums[i+1])));
            
        }
        ans+=d;
        return ans;
    }
};