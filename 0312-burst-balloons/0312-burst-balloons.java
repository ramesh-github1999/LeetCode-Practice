class Solution {
    int dp[][];
    public int fun(int []nums,int l,int h){
        if(l>h) return 0;
       // if(nums.length==0) return 0;
        if(dp[l][h]!=0) return dp[l][h];
        int ans=0;
        for (int i = l; i <=h; i++) {
           int left= l-1<0?1: nums[l-1];
            int right=h+1>nums.length-1?1:nums[h+1];
            int currentAns=left*right*nums[i];
            ans=Math.max(ans,currentAns+fun(nums,l,i-1)+fun(nums,i+1,h));
        }
        return dp[l][h]=ans;
    }
    public int maxCoins(int[] nums) {
        int n=nums.length;
        dp=new int[n+1][n+1];
        return fun(nums,0,nums.length-1);
    }
}