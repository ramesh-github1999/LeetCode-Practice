class Solution {
public:
    bool static comp(int a,int b){
        string sa=to_string(a);
        string sb=to_string(b);
        return sa+sb>sb+sa;
    }
    string largestNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end(),comp);
        string ans="";
        for(int i=0;i<nums.size();i++) ans+=to_string(nums[i]);
        if(ans[0]=='0') return "0"; // cases like "00"
       
        return ans;
    }
};
//[111311, 1113]

