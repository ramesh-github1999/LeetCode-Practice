class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx=0;
        int i=0,j=0;
        int n=nums1.length;
        int m=nums2.length;
        int []v=new int[n+m];
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]) v[idx++]=nums1[i++];
            else v[idx++]=nums2[j++];
        }
        while(i<n) v[idx++]=nums1[i++];
        while(j<m) v[idx++]=nums2[j++];
        int t=(m+n);
        if(t%2==1) return (double) v[t/2];
        else return (double) (v[t/2-1]+v[t/2])/2;
    }
}