class Solution {
public:
   bool static comp(pair<char,int>p1, pair<char,int>p2){
        if(p1.second == p2.second){
            return p1.first>p2.first;
        }
        
        return p1.second>p2.second;
    }
    
    string frequencySort(string s) {
        
        map<char,int> mp;
        for(int i = 0; i<s.size(); i++){
            mp[s[i]]++;
        }
        
        vector<pair<char,int>> v;
        
        for(auto it:mp){
            v.push_back(it);
        }
       
        sort(v.begin(),v.end(),comp);
        
        s = "";
        for(int i = 0; i<v.size(); i++){
            int freq = v[i].second;
           char st = v[i].first;
            while(freq){
                s+=st;
                freq--;
            }
        }
        
        return s;
    }
};