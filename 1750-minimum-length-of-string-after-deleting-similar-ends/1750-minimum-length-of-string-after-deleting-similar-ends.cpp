class Solution {
public:
    int minimumLength(string s) {
       map<char,int>mp;
        int i=0;int j=s.length()-1;
        if(s.length()==1) return 1;
        while(i<j){
            if(s[i]!=s[j]) return j-i+1;
            else{
                char temp=s[i];
                i++;j--;
                
            while(i<=j && s[i]==temp) i++;
            while(i<=j && s[j]==temp) j--;
               // cout<<i<<" "<<j<<endl;
            }
            
           
        }
        return j-i+1;
    }
};