class Solution {
    public int minDeletion(int[] nums) {
       int res=0;
        boolean atEvenIndex=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                if(atEvenIndex==true && i%2==0) {
                    res++;
                    atEvenIndex=false;
                }
                else if(atEvenIndex==false && i%2==1) {
                    res++;
                    atEvenIndex=true;
                }
            }
        }
        if((nums.length-res)%2==1) res++;
        return res;
        
    }
}