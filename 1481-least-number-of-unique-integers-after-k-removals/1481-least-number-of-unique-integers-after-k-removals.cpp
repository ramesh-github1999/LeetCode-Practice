class Solution {
public:
    #define pp pair<int,int>
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        map<int,int>mp;
        for(auto it:arr) mp[it]++;
        priority_queue<pp,vector<pp>,greater<pp>>pq;
        for(auto it:mp){
            pq.push({it.second,it.first});
        }
        while(pq.size()>0){
            if(pq.top().first<=k) {
                k-=pq.top().first;
                pq.pop();
            }
            else return pq.size();
        }
        return 0;
    }
};