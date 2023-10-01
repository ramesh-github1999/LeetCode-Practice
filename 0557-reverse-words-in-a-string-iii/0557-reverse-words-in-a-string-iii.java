class Solution {
    public String reverseWords(String input) {
         StringBuilder nb=new StringBuilder();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=' ') nb.append(input.charAt(i));
            else{
                sb.append(nb.reverse());
                sb.append(" ");
                nb=new StringBuilder();
            }
        }
        sb.append(nb.reverse());
       return sb.toString();
    }
}
