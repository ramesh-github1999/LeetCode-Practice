class Solution {
    public int lengthOfLIS(int[] nums) {
         List<Integer>l=new ArrayList<>();
        l.add(nums[0]);
        for (int i = 1; i <nums.length; i++) {
            if(l.get(l.size()-1)<nums[i]){
                l.add(nums[i]);
            }
            else{
                int j=0;
                while (nums[i]>l.get(j)) j++;
                l.set(j,nums[i]);
            }
        }
        return l.size();
    }
}