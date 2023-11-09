class Solution {
public:
    int numSplits(string s) {
        int n=s.length();
          map<char,int>rightmap;
        for(int i=0;i<n;i++) rightmap[s[i]]++;
        map<char,int>leftmap;
        int cnt=0;
        for(int i=0;i<n;i++){
            rightmap[s[i]]--;
            if(rightmap[s[i]]==0) rightmap.erase(s[i]);
            leftmap[s[i]]++;
            if(leftmap.size()==rightmap.size()) cnt++;
        }
        return cnt;
    }
};