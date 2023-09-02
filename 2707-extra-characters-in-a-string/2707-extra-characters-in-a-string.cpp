class Solution {
public:
    int solve(string s,unordered_map<string,int>&mp,int idx,vector<int>&dp){
        if(idx>=s.length()) return 0;
        if(dp[idx]!=-1) return dp[idx];
        string currStr="";
        int minExtra=s.length();
        for(int currIdx=idx;currIdx<s.length();currIdx++){
            currStr.push_back(s[currIdx]);
            int currExtra=(mp.count(currStr))?0:currStr.size();
            int nextExtra=solve(s,mp,currIdx+1,dp);
            int totalExtra=currExtra+nextExtra;
            minExtra=min(totalExtra,minExtra);
        }
        return dp[idx]=minExtra;
    }
    int minExtraChar(string s, vector<string>& dictionary) {
        unordered_map<string,int>mp;
        for(auto i:dictionary)mp[i]++;
        int n=s.length();
        vector<int>dp(n,-1);
        return solve(s,mp,0,dp);
           
    }
};
