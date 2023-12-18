class Solution {
public:
    int maxProductDifference(vector<int>& nums) {
        int maxi1=0;
        int maxi2=0;
        int mini1=10001;
        int mini2=10001;
        for(int i=0;i<nums.size();i++){
            if(nums[i]>=maxi1){
                maxi2=maxi1;
                maxi1=nums[i];
            }
            else if(nums[i]>=maxi2) maxi2=nums[i];
            
             if(nums[i]<=mini1){
                mini2=mini1;
                mini1=nums[i];
            }
            else if(nums[i]<=mini2) mini2=nums[i];
            
            
        }
        return (maxi1*maxi2)-(mini1*mini2);
    }
};