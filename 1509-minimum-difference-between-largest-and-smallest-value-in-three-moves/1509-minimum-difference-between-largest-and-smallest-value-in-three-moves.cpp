class Solution {
public:
    int minDifference(vector<int>& nums) {
        // 1,5,0,10,14
        // 0 1 5 10 14
        // 0 1 0 0 0
        // 1 5 0 10 14
        // 1 2 3 3 3 
       // -1 -2 -3- 1-1 -1
        // [82,81,95,75,20]
        // 20 75 81 82 95
        int n=nums.size();
        if(n<=3) return 0;
        sort(nums.begin(),nums.end());
        int ans1=nums[n-4]-nums[0];
        int ans2=nums[n-1]-nums[3];
        int ans3=nums[n-2]-nums[2];
        int ans4=nums[n-3]-nums[1];
         int minans=min(ans1,ans2);
        int minans2=min(ans3,ans4);
        return min(minans,minans2);
      //  return 0;
        
    }
};