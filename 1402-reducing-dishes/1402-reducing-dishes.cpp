class Solution {
public:
    int maxSatisfaction(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int maxi=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int sum=0;
            int curr=1;
            for(int j=i;j<n;j++){
                sum+=nums[j]*curr;
                curr++;
            }
            maxi=max(sum,maxi);
        }
        return maxi;
    }
};