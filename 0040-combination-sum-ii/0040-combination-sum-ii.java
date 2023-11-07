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
            fun(arr,l,i+1,target-arr[i]);
            l.remove(l.size()-1);
        }
        i++;
        
        while(i<arr.length && arr[i]==arr[i-1]) i++;
        fun(arr,l,i,target);
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> l=new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates,l,0,target);
        return ans;
    }
}