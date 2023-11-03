class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string>ans;
        int curr=0;
       for(int i=0;i<target.size();i++){
           while(curr<target[i]-1){
               ans.push_back("Push");
               ans.push_back("Pop");
               curr++;
           }
               ans.push_back("Push");
           curr++;
           
       }
        return ans;
        
    }
};