class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
         int n = nums.length;
        long sum=0;
        Map<Integer, Integer> mp = new HashMap<>();
        int j=0,i=0;
        long ans=0;
        while(j<n){
            mp.put(nums[j] , mp.getOrDefault(nums[j], 0) + 1);

            sum+=nums[j];
            if(j-i+1==k) {
                if (mp.size() == k) {
                    ans = Math.max(sum, ans);
                }
                mp.put(nums[i], mp.get(nums[i]) - 1);
                if (mp.get(nums[i]) == 0)
                    mp.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            j++;
            }
        return ans;
            
    }
}