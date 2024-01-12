class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int n=nums.size();
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int l=0,h=n-1;
        while(l<=h){
            int m=(l+h)/2;
            if(m-1>=0 && m+1<n && nums[m-1]<nums[m] && nums[m]>nums[m+1]) return m;
            else if(m+1<n && nums[m+1]>nums[m]) l=m+1;
            else h=m-1;
        }
        return -1;
        
    }
};

 