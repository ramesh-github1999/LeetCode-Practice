class Solution {
public:
    int maxNonOverlapping(vector<int>& nums, int target) {
        // -1 4 9 10 14 16 18 9
        
        int n=nums.size();
       unordered_map<int,int>mp;
        int sum=0;
        int cnt=0;
        // -1 2 7 8
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum-target==0 || mp[sum-target]){
                cnt++;
                sum=0;
                mp.clear();
              //  cout<<i<<endl;
                
            }
            else {
                mp[sum]++;
            }
        }
        return cnt;
        
        
    }
};