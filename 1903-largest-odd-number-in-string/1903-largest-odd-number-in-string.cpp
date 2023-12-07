class Solution {
public:
    string largestOddNumber(string num) {
        int k=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num[i]-'0')%2==1) {
                k=i;
                break;
            }
        }
        if(k==-1) return "";
        else return num.substr(0,k+1);
    }
};