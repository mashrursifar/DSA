package BackTracking;

import java.util.*;

public class nQueensLeetCode {

     public static void boardMaker(char board[][], int row, List<List<String>> list) {
        if (row == board.length) {
            List<String> l = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                StringBuilder s = new StringBuilder();
                for (int j = 0; j < row; j++) {
                    s.append(board[i][j]);
                }
                l.add(s.toString());
            }
            list.add(l);
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (isValid(board, row, i)) {
                board[row][i] = 'Q';
                boardMaker(board, row + 1, list);
                board[row][i] = '.';
            }
        }
    }

     public static boolean isValid(char chess[][], int row, int col){

        // Upper
        for(int i=row-1;i>=0;i--){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        // Upper Left
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(chess[i][j]=='Q')
                return false;
        }

        // Upper Right
        for(int i=row-1,j=col+1; i>=0 && j<chess.length ; i--,j++){
            if(chess[i][j]=='Q')
                return false;
        }


        return true;
    }

    public static List<List<String>> solveNQueens(int n){
        char board[][] = new char[n][n];
        List<List<String>> list = new ArrayList<>();

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boardMaker(board, 0, list);
        return list;
    }


    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
