class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer,Integer>mp=new HashMap<>();
        int n=nums.length;
        // nums[i]-nums[j]=k
        for (int i = 0; i < n; i++) {
           mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for (Map.Entry<Integer,Integer>it:mp.entrySet()) {
              int key=it.getKey();
              int val=it.getValue();
            if(k==0 && val>1) ans++;
             else if(k>0 && mp.containsKey(key+k)) ans++;
        }
        return ans;
    }
}