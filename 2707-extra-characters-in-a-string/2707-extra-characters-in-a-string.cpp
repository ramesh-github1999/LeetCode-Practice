class Solution {
public:
   
    int minExtraChar(string s, vector<string>& dictionary) {
        unordered_map<string,int>mp;
        for(auto i:dictionary)mp[i]++;
        int n=s.length();
        vector<int>dp(n+1,0);
        
        for(int idx=n-1;idx>=0;idx--){
            string currStr="";
            int minExtra=s.length();
            for(int currIdx=idx;currIdx<n;currIdx++){
                currStr.push_back(s[currIdx]);
            int currExtra=(mp.count(currStr))?0:currStr.size();
            int nextExtra=dp[currIdx+1];
            int totalExtra=currExtra+nextExtra;
            minExtra=min(totalExtra,minExtra);
            }
            dp[idx]=minExtra;
        }
        return dp[0];
           
    }
};
