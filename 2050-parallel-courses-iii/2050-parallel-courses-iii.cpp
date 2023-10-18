class Solution {
public:
    int minimumTime(int n, vector<vector<int>>& nums, vector<int>& time) {
          vector<vector<int>>graph(n+1,vector<int>());
         vector<int>indegree(n+1,0);
        for(int i=0;i<nums.size();i++){
            graph[nums[i][0]].push_back(nums[i][1]);
            indegree[nums[i][1]]++;
        }
       
       queue<int>q;
        vector<int>maxTime(n+1,0);
        
        for(int i=1;i<=n;i++){
           if(indegree[i]==0) {
              // cout<<"ok";
               q.push(i);
               maxTime[i]=time[i-1];
           }
        }
       
        while(q.empty()==false){
           
           int curr=q.front();
            q.pop();
            for(auto v:graph[curr]){
                maxTime[v]=max(maxTime[v],maxTime[curr]+time[v-1]);
                    indegree[v]--;
                    if(indegree[v]==0) q.push(v);
                }
                
            }
        int ans=0;
        for(int i=1;i<=n;i++) ans=max(ans,maxTime[i]);
        return ans;
    }
    // 2 8 3
};