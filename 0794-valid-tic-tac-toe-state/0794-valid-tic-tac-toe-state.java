class Solution {
   public boolean isGameOver(String[] board, char ch) {
        //row check
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == ch && board[i].charAt(1) == ch && board[i].charAt(2) == ch) return true;
        }
        // column check
        for (int j = 0; j < 3; j++) {
            if (board[0].charAt(j) == ch && board[1].charAt(j) == ch && board[2].charAt(j) == ch) {
                System.out.println(j);
                return true;
        }
        }

        // diagonal check
        if (board[0].charAt(0) == ch && board[1].charAt(1) == ch && board[2].charAt(2) == ch) return true;
        // anti diagonal check
        if (board[0].charAt(2) == ch && board[1].charAt(1) == ch && board[2].charAt(0) == ch) return true;
        return false;
    }
    
    
    public boolean validTicTacToe(String[] board) {

        int xcount=0;
        int zerocount=0;
        for(int i=0;i<3;i++){
            String str=board[i];
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='X') xcount++;
                else if(str.charAt(j)=='O') zerocount++;
            }
        }
        if(zerocount>xcount || xcount-zerocount>1) return false;
        boolean xwin=isGameOver(board,'X');
        boolean owin=isGameOver(board,'O');
      //  System.out.println(xwin+" "+owin);
        if(xwin==true && zerocount==xcount) return false;
        if(owin==true && xcount>zerocount) return false;
        
        return true;
    }
}