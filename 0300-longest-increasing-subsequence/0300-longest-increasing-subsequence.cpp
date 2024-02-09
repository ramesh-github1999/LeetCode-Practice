class Solution {
public:
    vector<vector<int>>dp;
    int fun(vector<int>& nums,int idx,int pre_idx,int n){
        if(idx==n) return 0;
        if(dp[idx][pre_idx+1]!=-1) return dp[idx][pre_idx+1];
        int len=fun(nums,idx+1,pre_idx,n);
        if(pre_idx==-1 || nums[idx]>nums[pre_idx]) len=max(len,1+fun(nums,idx+1,idx,n));
        return dp[idx][pre_idx+1]=len;
    }
    int lengthOfLIS(vector<int>& nums) {
        int n=nums.size();
        dp.resize(n,vector<int>(n+1,-1));
        // int maxi=1;
        // vector<int>dp(n,1);
        // for(int i=0;i<n;i++){
        //     for(int prev=0;prev<i;prev++){
        //         if(nums[prev]<nums[i]) dp[i]=max(dp[i],dp[prev]+1);
        //     }
        //     maxi=max(dp[i],maxi);
        // }
        // return maxi;
        return fun(nums,0,-1,nums.size());
    }
};

// [10,9,2,5,3,7,101,18]


// 10 _
