class Solution {
public:
    int minimumLength(string s) {
       map<char,int>mp;
        int i=0;int j=s.length()-1;
        if(s.length()==1) return 1;
        while(i<=j){
            if(i==j){
                if(s[i-1]!=s[i]) return 1;
                else return 0;
            } 
            if(s[i]!=s[j]) return j-i+1;
            else{
                i++;j--;
            while(i<j && s[i]==s[i-1]) i++;
            while(i<j && s[j]==s[j+1]) j--;
               // cout<<i<<" "<<j<<endl;
            }
            
           
        }
        return 0;
    }
};