class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        while(k>0){
            if(i<n && nums[i]<0) {
                nums[i] = -1 * nums[i];
                i++;
                k--;
            }
            else break;
        }
        if(k%2==1){
            Arrays.sort(nums);
            nums[0]=nums[0]*-1;
        }
        int sum=0;
        for(int j:nums) sum+=j;
        return sum;
    }
}