class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        int n=intervals.size();
        int L=intervals[0][0];
        int R=intervals[0][1];
        vector<vector<int>>v;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=R){
                R=max(intervals[i][1],R);
            }
            else {
                v.push_back({L,R});
                L=intervals[i][0];
                R=intervals[i][1];
            }
        }
        v.push_back({L,R});
        return v;
    }
};