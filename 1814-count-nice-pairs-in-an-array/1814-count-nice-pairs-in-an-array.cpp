class Solution {
public:
    int mod=1000*1000*1000+7;
    long long int calculatenc2(int n){
        return ((long long int )n*(n-1))/2;
    }
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
        map<int,int>mp;
        for(int i=0;i<n;i++){
            int rev=reverse(nums[i]);
            mp[nums[i]-rev]++;
        }
      
        int ans=0;
        for(auto it:mp){
            if(it.second>=2){
                ans=(ans%mod+calculatenc2(it.second)%mod)%mod;
            }
        }
        return  ans%mod;
    }
};