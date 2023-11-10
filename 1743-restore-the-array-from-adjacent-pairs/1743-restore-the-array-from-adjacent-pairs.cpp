class Solution {
public:
    unordered_map<int,vector<int>>mp;
    vector<int>ans;
    void dfs(int node,int prev){
        ans.push_back(node);
        for(int neighbor:mp[node]){
            if(neighbor!=prev){
                dfs(neighbor,node);
            }
        }
    }
    
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        int n=adjacentPairs.size();
        for(int i=0;i<n;i++){
            mp[adjacentPairs[i][0]].push_back(adjacentPairs[i][1]);
            mp[adjacentPairs[i][1]].push_back(adjacentPairs[i][0]);
        }
        int root=0;
        for(auto it:mp){
            if(it.second.size()==1){
           root=it.first;
           break;
        }    
    
    }
        dfs(root,INT_MAX);
        return ans;
            
    }
};