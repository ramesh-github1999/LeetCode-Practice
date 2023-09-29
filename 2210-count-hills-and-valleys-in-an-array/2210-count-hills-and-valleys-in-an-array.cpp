class Solution {
public:
// 6 6 5 5 4 1
// 6 6 6 6 6 6 lmax
// 6 6 5 5 4 1 rmax

// 6 6 5 5 4 1 lmin
// 1 1 1 1 1 1 rmin
    int countHillValley(vector<int>& nums) {
        
        int cnt=0;
        int n=nums.size();
      int left=nums[0];
        for(int i=1;i<n-1;i++){
                if((nums[i]>left && nums[i]>nums[i+1])  || (nums[i]<left && nums[i]<nums[i+1])) {
                    cnt++;
                    left=nums[i];
                }
        }
        return cnt;
    }
};