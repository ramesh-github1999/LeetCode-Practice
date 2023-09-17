class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i=0;int k=0;
        while(i<nums.size()){
            if(nums[i]!=0)
              nums[k++]=nums[i];
            i++;
        }
        while(k<nums.size()) nums[k++]=0;
        
    }
};