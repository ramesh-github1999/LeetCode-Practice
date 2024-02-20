class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        shifts[n-1]%=26;
        for(int i=n-2;i>=0;i--) shifts[i]=(shifts[i]%26+shifts[i+1])%26;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            int k=sb.charAt(i)-'a';
            sb.setCharAt(i, (char) ('a'+((shifts[i]+k)%26)));
        }
        return sb.toString();
        
     }
    
}