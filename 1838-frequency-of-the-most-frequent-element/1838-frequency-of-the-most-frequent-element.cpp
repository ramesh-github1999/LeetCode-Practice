class Solution {
public:
    #define lli long long int
    int maxFrequency(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int l=0;
        int ans=0;
        lli curr=0;
        for(int r=0;r<nums.size();r++){
            int tar=nums[r];
            curr+=tar;
            while((lli)(r-l+1)*tar-curr>k){
                curr-=nums[l];
                l++;
            }
            ans=max(ans,r-l+1);
            
        }
        return ans;
    }
};