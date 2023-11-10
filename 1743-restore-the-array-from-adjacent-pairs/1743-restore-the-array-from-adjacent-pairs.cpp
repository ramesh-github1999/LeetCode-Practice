class Solution {
public:
    /*
2=>1,3
1=>2
3=>4,2
4=>3


*/
     map<int,vector<int>>mp;
    set<int>st;
    vector<int>ans;
    void dfs(int i){
        if(st.size()==mp.size()) return;
        st.insert(i);
        ans.push_back(i);
        vector<int>v=mp[i];
        for(int i=0;i<v.size();i++){
            if(st.find(v[i])==st.end()){
                dfs(v[i]);
            }
        }
    }
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        int n=adjacentPairs.size();
        for(int i=0;i<n;i++){
            mp[adjacentPairs[i][0]].push_back(adjacentPairs[i][1]);
            mp[adjacentPairs[i][1]].push_back(adjacentPairs[i][0]);
        }
        for(auto it:mp) if(it.second.size()==1){
            dfs(it.first);
        }
        return ans;
            
    }
};


/*
2=>1,3
1=>2
3=>4,2
4=>3


*/