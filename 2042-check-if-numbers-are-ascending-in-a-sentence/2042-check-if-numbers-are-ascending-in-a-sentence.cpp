class Solution {
public:
    bool areNumbersAscending(string s) {
        int n=s.length();
        int last=0;
        for(int i=0;i<n;i++){
            int num=0;
            if(s[i]>'0' && s[i]<='9'){
                if(i+1<n && s[i+1]==' ' || i+1==n) {
                    num=s[i]-'0';
                }
                    
                else if(i+1<n && s[i+1]!=' '){
                    num=(s[i]-'0')*10;
                    num+=s[i+1]-'0';
                    i++;
                }
                    if(last>=num) {
                        cout<<last<<" "<<num<<endl;
                        return false;
                    }
                    else last=num;
            }
        
    }
        return true;
    }
};