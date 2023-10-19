class Solution {
       public static   String fun(String s) {
        StringBuffer a = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') a.append(s.charAt(i));
            else {
                if (a.length() > 0) a.deleteCharAt(a.length() - 1);
            }

        }
        return a.toString();
    }
     public boolean backspaceCompare(String s, String t){
        String a=fun(s);
        String b=fun(t);
        System.out.println(a);
        System.out.println(b);
        if(a.equals(b)) return true;
        else return false;

    }
   
}
