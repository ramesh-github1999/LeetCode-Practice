class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        // Pepcoding soln
        int n=nums.length;
        long ans=0;
        HashMap<Integer,Integer>[]mp=new HashMap[n];
        for(int i=0;i<n;i++){
            mp[i]=new HashMap<>();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                long cd=(long)nums[i]-(long)nums[j];
                if(cd<Integer.MIN_VALUE || cd>Integer.MAX_VALUE) continue;
                int diff=(int) cd;
                int apsEndingOnJ=mp[j].getOrDefault(diff,0);
                int apsEndingOnI=mp[i].getOrDefault(diff,0);
                ans+=apsEndingOnJ;
                mp[i].put(diff,apsEndingOnJ+apsEndingOnI+1);
            }
        }
        return (int)ans;
    }
}