class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void fun(int [] arr,List<Integer>l,int i,int target){
       if(target==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        if(i==arr.length) return;
        if(arr[i]<=target){
            l.add(arr[i]);
            fun(arr,l,i,target-arr[i]);
            l.remove(l.size()-1);
        }
        fun(arr,l,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<Integer> l=new ArrayList<>();
       fun(candidates,l,0,target);
       return ans;
    }
}