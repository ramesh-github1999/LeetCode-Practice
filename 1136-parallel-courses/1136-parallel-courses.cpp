class Solution {
public:
    int minimumSemesters(int n, vector<vector<int>>& relations) {
        vector<int>indegree(n+1,0);
        vector<vector<int>>graph(n+1);
        for(int i=0;i<relations.size();i++){
            indegree[relations[i][1]]++;
            graph[relations[i][0]].push_back(relations[i][1]);
        }
        queue<int>q;
        for(int i=1;i<=n;i++){
            if(indegree[i]==0) q.push(i);
        }
        int ans=0;
        while(q.empty()==false){
            ans++;
            int size=q.size();
            for(int i=0;i<size;i++){
                int curr=q.front();
                q.pop();
                for(auto v:graph[curr]){
                    indegree[v]--;
                    if(indegree[v]==0)q.push(v);
                }
                
            }
        }
         for(int i=1;i<=n;i++){
            if(indegree[i]!=0) return -1;
        }
        return ans;
    }
};