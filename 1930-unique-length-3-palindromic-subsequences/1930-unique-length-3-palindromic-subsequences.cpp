class Solution {
public:
    int countPalindromicSubsequence(string s) {
        int n=s.length();
        vector<pair<int,int>>v(26,{-1,-1});
        for(int i=0;i<n;i++){
            if(v[s[i]-'a'].first==-1) v[s[i]-'a'].first=i;
            else v[s[i]-'a'].second=i;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(v[i].second!=-1){
                unordered_set<char>st;
                for(int j=v[i].first+1;j<v[i].second;j++)
                    st.insert(s[j]);
                ans+=st.size();
            }
        }
        return ans;
    }
};