class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String ans="";
        int n=nums.length;
        for(int i=0;i<n;i++){
            char c=nums[i].charAt(i);
            if(c=='0') ans+='1';
            else ans+='0';
        }
        return ans;
    }
}