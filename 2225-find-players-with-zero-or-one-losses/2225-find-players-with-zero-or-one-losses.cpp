class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& nums) {
        map<int,int>mp,mp2;
        int n=nums.size();
        for(int i=0;i<n;i++){
            mp[nums[i][0]]++;
            mp[nums[i][1]]++;
            mp2[nums[i][0]]++;
            mp2[nums[i][1]]--;
        }
        vector<int>v1,v2;
        for(auto it:mp){
            if(mp2[it.first]==it.second) v1.push_back(it.first);
            if(mp2[it.first]==it.second-2) v2.push_back(it.first);
            
        }
        return {v1,v2};
    }
};