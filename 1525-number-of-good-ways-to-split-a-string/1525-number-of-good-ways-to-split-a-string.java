class Solution {
    public int numSplits(String s) {
       int n=s.length();
        Map<Character,Integer>rightmap=new HashMap<>();
        for(int i=0;i<n;i++) rightmap.put(s.charAt(i),rightmap.getOrDefault(s.charAt(i),0)+1);
        Map<Character,Integer>leftmap=new HashMap<>();
        int cnt=0;
        for(int i=0;i<n;i++){
            rightmap.put(s.charAt(i),rightmap.get(s.charAt(i))-1);
            if(rightmap.get(s.charAt(i))==0) rightmap.remove(s.charAt(i));
            leftmap.put(s.charAt(i),leftmap.getOrDefault(s.charAt(i),0)+1);
            if(leftmap.size()==rightmap.size()) cnt++;
        }
        return cnt;
    }
}