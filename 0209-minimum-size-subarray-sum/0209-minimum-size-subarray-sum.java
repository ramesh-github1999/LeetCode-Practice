class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int n=nums.length;
        int sum=0;
        int i=0;
        int ans=n+1;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                ans=Math.min(ans,j-i+1);
                sum-=nums[i++];
            }
            j++;
        }
        return ans==n+1?0:ans;
    }
}