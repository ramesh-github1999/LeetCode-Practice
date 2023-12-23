class Solution {
public:
    bool isPathCrossing(string path) {
        int x=0,y=0;
       set<string>st;
       
       st.insert("0,0");
       
        for(int i=0;i<path.length();i++){
            if(path[i]=='N') y+=1;
            else if(path[i]=='S') y-=1;
            else if(path[i]=='E') x+=1;
            else x-=1;
            string str=to_string(x)+","+to_string(y);
            if(st.find(str)!=st.end()) return true;
            st.insert(str);
        }
        return false;
    }
};