class Solution {
public:
    bool makeEqual(vector<string>& words) {
        map<char,int>mp;
        for(auto it:words){
            for(int i=0;i<it.length();i++) mp[it[i]]++;
        }
        int n=words.size();
        for(auto it:mp){
            if(it.second%n!=0) return false;
        }
        return true;
    }
};