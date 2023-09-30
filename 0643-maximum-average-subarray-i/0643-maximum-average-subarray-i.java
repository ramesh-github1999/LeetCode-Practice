class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return 0;
        double sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        double ans=sum/k;
        int idx=k;
        int i=0;
        while(idx<n){
            sum-=nums[i];
            sum+=nums[idx];
            ans=Math.max(ans,sum/k);
            i++;
            idx++;
        }
        return ans;
    }
}