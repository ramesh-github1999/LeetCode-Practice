class Solution {
    public static boolean isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i))return false;
        }
        return true;
    }
    public int countSubstrings(String s) {
        String que="";
      //  for(int i=0;i<1000;i++) que+='a';
       // System.out.println(que);
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