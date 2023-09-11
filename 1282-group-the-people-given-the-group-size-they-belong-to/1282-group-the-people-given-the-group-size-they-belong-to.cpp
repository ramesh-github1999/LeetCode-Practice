class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        map<int,vector<int>>mp;
        int n=groupSizes.size();
        for(int i=0;i<n;i++){
            mp[groupSizes[i]].push_back(i);
        }
        vector<vector<int>>ans;
        for(auto it:mp){
            int k=it.first;
            vector<int>v=it.second;
            int m=v.size();
            if(m==k) ans.push_back(v);
            
            else{
                vector<int>partans;
                for(int i=0;i<m;i++){
                   partans.push_back(v[i]);
                    if(i%k==k-1) {
                        ans.push_back(partans);
                        partans.clear();
                    }
                    
                }
                
            }
        }
        return ans;
    }
};