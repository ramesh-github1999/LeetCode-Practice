class Solution {
    static Map<String,Boolean> mp=new HashMap<>();
    public static boolean isPalindrome(String s){
         if(mp.containsKey(s)) return mp.get(s);
        
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                mp.put(s,false);
                return false;
            }
        }
        mp.put(s,true);
        return true;
    }
    public int countSubstrings(String s) {
        String que="";
     
         int n=s.length();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            String str="";
            for(int j=i;j<n;j++){
                str+=s.charAt(j);
                if(isPalindrome(str)) cnt++;
            }
        }
        return cnt;
    }
}