class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newIntervals) {
        // for any two interval to merge s(0) e(0) with s(1) e(1) condition should be s[0]<=e(1) && e(0)>=s[1]
        // s(0) and e(0) is the start and end point of 1st interver and s(1) && e(1) is the start and end point of second new interval
        int n=intervals.size();int i=0;
        vector<vector<int>>v;
        if(n==0) {
            v.push_back(newIntervals);
            return v;
        }
        while(i<n && intervals[i][1]<newIntervals[0]){
            
            v.push_back(intervals[i]);
            i++;
        }
        
        int mini=newIntervals[0];
        int maxi=newIntervals[1];
        while(i<n && intervals[i][0]<=newIntervals[1]){
            mini=min(intervals[i][0],mini);
            maxi=max(maxi,intervals[i][1]);
            i++;
           // cout<<mini<<" "<<maxi<<endl;
        }
        v.push_back({mini,maxi});
        while(i<n){
             v.push_back(intervals[i]);
            i++;
        }
        return v;
        
    }
};