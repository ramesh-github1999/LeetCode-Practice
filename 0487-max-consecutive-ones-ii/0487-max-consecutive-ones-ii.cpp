class Solution {
public:
    
    int findMaxConsecutiveOnes(vector<int>& nums) {
        //parent question of this is leetcode 1004. Max Consecutive Ones III with k=1;
        int zero=0,i=0,j=0,ans=0,n=nums.size();
        while(j<n){
            if(nums[j]==0) zero++;
            if(zero<=1) ans=max(ans,j-i+1),j++;
            else {
                while(zero>1){
                    if(nums[i]==0)zero--;
                    i++;
                }
                j++;
            }
        }
        return ans;
       // int zero=0;
        
    }
};