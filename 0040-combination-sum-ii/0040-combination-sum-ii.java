class Solution {
     List<List<Integer>> ans=new ArrayList<>();
    void fun(int [] arr,List<Integer>l,int idx,int target){
        if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(target<0 || idx==arr.length) return;
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1]) continue;
            l.add(arr[i]);
            fun(arr, l, i + 1, target - arr[i]);
            l.remove(l.size() - 1);
        }


    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates,l,0,target);
        return ans;
    }
}