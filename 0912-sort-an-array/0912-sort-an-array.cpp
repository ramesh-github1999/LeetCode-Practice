class Solution {
public: 
    void merge(vector<int>&nums,int l,int mid,int h){
        int i=l,j=mid+1,k=0;
        // l, h h-l+1
        // 0, 3, 5
        // 0,1,2
        // 3,4,5
        // i=l,j=3
        vector<int>b(h-l+1);
        while(i<=mid && j<=h){
            if(nums[i]<nums[j]) b[k++]=nums[i++];
            else b[k++]=nums[j++];
        }
        while(i<=mid) b[k++]=nums[i++];
        while(j<=h) b[k++]=nums[j++];
        for(int i=0;i<k;i++) nums[l+i]=b[i];
    }
    void mergesort(vector<int>&nums,int l,int h){
        if(l<h){
        int mid =(l+h)/2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,h);
        merge(nums,l,mid,h);
        }
    }
    vector<int> sortArray(vector<int>& nums) {
        mergesort(nums,0,nums.size()-1);
        return nums;
    }
};