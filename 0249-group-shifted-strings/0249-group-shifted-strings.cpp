class Solution {
public:  
    string fun(string s){
        int shift=s[0]-'a';
        for(int i=0;i<s.length();i++){
            int k=s[i]-'a';
            k=(k-shift+26)%26;
            s[i]=k+'a';
        }
        return s;
    
    }
    vector<vector<string>> groupStrings(vector<string>& strings) {
            map<string,vector<string>>mp;
        for(auto it:strings){
            string str=fun(it);
            mp[str].push_back(it);
        }
         vector<vector<string>>ans;
        for(auto it:mp) ans.push_back(it.second);
        return ans;
    }
   
   
};