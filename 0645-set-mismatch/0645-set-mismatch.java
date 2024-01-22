class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        int dup=-1,missing=-1;
        for(int i=1;i<=nums.length;i++){
            if(mp.containsKey(i)){
                if(mp.get(i)==2) dup=i;
            }
            else missing=i;
        }
        return new int[]{dup,missing};
    }
}