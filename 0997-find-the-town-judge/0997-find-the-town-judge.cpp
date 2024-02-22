class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
            vector<int>dp(n+1,0);
        for (int i=0;i<trust.size();i++){
            dp[trust[i][1]]++;
        }
        int ans=-1;
        for (int i=1;i<=n;i++)
            if(dp[i]==n-1) ans=i;
        if(ans==-1) return -1;
        for (int i = 0; i <trust.size() ; i++) {
            if(trust[i][0]==ans) return -1;
        }
        return ans;
    }
};