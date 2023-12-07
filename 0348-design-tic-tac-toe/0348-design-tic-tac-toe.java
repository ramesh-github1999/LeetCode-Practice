class TicTacToe {

     int v[][];
    public TicTacToe(int n) {
          v=new int[n][n];
    }
   boolean rowCheck(int v[][],int row,int col){
        int k=v[row][col];
        int n=v.length;
        for(int j=0;j<n;j++) if(v[row][j]!=k) return false;
        return true;
    }

    boolean columnCheck(int v[][],int row,int col){
        int k=v[row][col];
        int n=v.length;
        for(int i=0;i<n;i++) if(v[i][col]!=k) return false;
        return true;
    }

    boolean diagonalCheck(int v[][],int row,int col){
        int k=v[row][col];
        for(int i=0;i<v.length;i++){
            if(v[i][i]!=k) return false;
        }
        return true;
    }

    boolean AntiDiagonalCheck(int v[][],int row,int col){
        int n=v.length;
        int k=v[row][col];
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
            //  System.out.println(i+" "+j);
            if(v[i][j]!=k) return false;
        }
        return true;
    }

    public int move(int row, int col, int player) {
        v[row][col] = player;
        //     System.out.println(diagonalCheck(v));
        if (rowCheck(v,row,col) || columnCheck(v,row,col) || diagonalCheck(v,row,col) || AntiDiagonalCheck(v,row,col)) return player;
        else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */