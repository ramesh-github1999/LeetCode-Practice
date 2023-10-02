class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int j=0,i=0;
        int maxi=0;
        Map<Integer,Integer>mp=new HashMap<>();
        while(j<n){
           // mp[fruits[j]]++;
            mp.put(fruits[j],mp.getOrDefault(fruits[j],0)+1);
            while(mp.size()>2){
                mp.put(fruits[i],mp.get(fruits[i])-1);
                if(mp.get(fruits[i])==0) mp.remove(fruits[i]);
                   i++;
                                                         
            }
            maxi=Math.max(j-i+1,maxi);
            j++;
        }
        return maxi;
    }
}