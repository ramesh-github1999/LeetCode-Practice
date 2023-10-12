/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int l=0;
        int n=mountainArr.length();
        int h=mountainArr.length()-1;
        int ans=-1;
        int peak=-1;

        while(l<=h) {
            int mid = (l + h) / 2;
            int midele = mountainArr.get(mid);
            int left = mid - 1 >= 0 ? mountainArr.get(mid - 1) : -1;
            int right = mid + 1 < n ? mountainArr.get(mid + 1) : -1;
            if (mid - 1 >= 0 && mid + 1 < n && left < midele && right < midele) {
                if(midele==target) return mid;
                peak = mid;
                break;
            }
            else if (mid + 1 < n && right < midele) h = mid - 1;
            else l = mid + 1;
        }
        int l1=0,h1=peak-1;
        while (l1<=h1){
            int mid=(l1+h1)/2;
            int midele=mountainArr.get(mid);
            if(midele==target) return mid;
            else if(midele<target) l1=mid+1;
            else h1=mid-1;
        }
        int l2=peak+1,h2=n-1;
        while (l2<=h2){
            int mid=(l2+h2)/2;
            int midele=mountainArr.get(mid);
            if(midele==target) return mid;
            else if(midele<target) h2=mid-1;
            else l2=mid+1;
        }
        return -1;
    }
}