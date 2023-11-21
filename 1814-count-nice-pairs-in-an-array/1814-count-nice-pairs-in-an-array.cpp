class Solution {
public:
    int mod=1000*1000*1000+7;
    int reverse(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }
    int countNicePairs(vector<int>& nums) {
       int n=nums.size();
         for(int i=0;i<n;i++){
           nums[i]-=reverse(nums[i]);
        }
        map<int,int>mp;
        int ans=0;
        for(int i=0;i<n;i++){
            ans=(ans%mod+mp[nums[i]]%mod)%mod;
            mp[nums[i]]++;
        }
        return  ans%mod;
    }
};