class Solution {
public:
    int pivotElement(vector<int>&nums,int l,int h){
        int n=nums.size();
        if(nums[h]>nums[0]) return 0;
        while(l<=h){
            int mid=(l+h)/2;
            if(mid+1<n && nums[mid]>nums[mid+1]) return mid+1;
            else if(mid-1>=0 && nums[mid]<nums[mid-1]) return mid;
            else if(nums[mid]>nums[n-1]) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
    
    
    

    int BinarySearch(vector<int>&nums,int l,int h,int tar){
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==tar) return mid;
            else if(nums[mid]>tar) h=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    
    int search(vector<int>& nums, int tar) {
        int n=nums.size();
        if (n == 1) {
            if (nums[0] == tar) return 0;
            else return -1;
        }
        int pivot=pivotElement(nums,0,n-1);
      //  cout<<pivot;
        if(tar<=nums[n-1]) return BinarySearch(nums,pivot,n-1,tar);
        else return BinarySearch(nums,0,pivot-1,tar);
    }
};