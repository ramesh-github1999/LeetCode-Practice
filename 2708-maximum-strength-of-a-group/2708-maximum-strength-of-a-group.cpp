class Solution {
public:
    long long maxStrength(vector<int>& nums) {
        long long ans=1;
        long long maxi=0;
        int cnt=0;
        int pno=0;
        int zero=0;
        int maxn=-10;
        int n=nums.size();
        if(n==1) return nums[0];
        for(int i=0;i<n;i++){
           if(nums[i]!=0) ans*=nums[i];
            maxi=max(maxi,ans);
            if(nums[i]<0) {
                cnt++;
            maxn=max(nums[i],maxn);
            }
            if(nums[i]==0) zero++;
            if(nums[i]>0) pno++;
        }
        if(pno==0 && cnt==1){
            if(zero>0) return 0;
            else return ans;
        }
        if(pno==0 && cnt==0) return 0;
        if(maxn<0 && cnt%2!=0) ans/=maxn;
        return ans;
    }
};