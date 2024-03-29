class Solution {
public:
    long long countFairPairs(vector<int>& nums, int lower, int upper) {
       sort(nums.begin(),nums.end());
        int n=nums.size();
        long long ans=0;
        for(int i=0;i<n;i++){
            int lb=lower_bound(nums.begin()+i+1,nums.end(),lower-nums[i])-nums.begin();
            int up=upper_bound(nums.begin()+i+1,nums.end(),upper-nums[i])-nums.begin();
                 ans+=(up-lb);
        }
        return ans;
      
        
    }
};