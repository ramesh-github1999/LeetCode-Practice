class TicTacToe {

     int v[][];
    public TicTacToe(int n) {
          v=new int[n][n];
    }
   boolean rowCheck(int v[][]){
        int n=v.length;
        // row check
        for (int i = 0; i < n; i++) {
             int k=v[i][0];
             if(k==0) continue;
            for (int j = 0; j < n; j++) {
                if (v[i][j] != k) {
                    break;
                }
                if (j == n - 1) return true;
            }
        }
        return false;
    }

    // colum check
    boolean columnCheck(int v[][]){
        int n=v.length;
        for(int j=0;j<n;j++){
          int k=v[0][j];
          if(k==0) continue;
            for(int i=0;i<n;i++){
                if(v[i][j]!=k) break;
                if (i==n-1) return true;
            }
        }
        return false;
    }

    // digonal

    boolean diagonalCheck(int v[][]){
        int k=v[0][0];
        int n=v.length;
        if(k!=0){
        for(int i=0;i<n;i++){
            if(v[i][i]!=k) break;
            if(i==n-1) return true;
        }
        }

        k=v[0][n-1];
        if(k!=0){
        for(int i=0,j=n-1;i<n && j>=0;i++,j--){
          //  System.out.println(i+" "+j);
            if(v[i][j]!=k) return false;
            if(i==n-1)return true;
        }
        }
        return false;
    }

    public int move(int row, int col, int player) {
       v[row][col]=player;
      //     System.out.println(diagonalCheck(v));
          if(rowCheck(v) || columnCheck(v) || diagonalCheck(v)) return player;
          else return 0;
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */