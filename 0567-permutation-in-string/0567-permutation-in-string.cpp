class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.length()>s2.length()) return false;
        sort(s1.begin(),s1.end());
        int l=s1.length();
        string substr=s2.substr(0,l);
        string newsubstr=substr;
        sort(newsubstr.begin(),newsubstr.end());
        if(newsubstr==s1) return true;
        int j=l;
        while(j<s2.length()){
            substr.erase(substr.begin());
            substr+=s2[j];
            string newsubstr=substr;
            sort(newsubstr.begin(),newsubstr.end());
            if(newsubstr==s1) return true;
            j++;
            
        }
        return false;
    }
};