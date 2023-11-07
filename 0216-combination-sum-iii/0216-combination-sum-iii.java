class Solution {
     List<List<Integer>>ans=new ArrayList<>();
    void fun(int [] arr,List<Integer>l,int idx,int target,int k) {
        if (target == 0 && l.size() == k) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (target < 0 || l.size() > k || idx == arr.length) return;
        for (int i = idx; i < arr.length; i++) {
            l.add(arr[i]);
            fun(arr, l, i + 1, target - arr[i], k);
            l.remove(l.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
          int arr[]={1,2,3,4,5,6,7,8,9};
          List<Integer>l=new ArrayList<>();
          fun(arr,l,0,n,k);
          return ans;
    }
}