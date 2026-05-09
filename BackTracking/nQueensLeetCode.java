package BackTracking;

public class nQueensLeetCode {
    
    public static void printArr(char chess[][]){
        System.out.println("----------chess board-------------");
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

     public static void boardMaker(char board[][],int row){

        if(row == board.length){
            printArr(board);
            return;
        }
        for(int i=0; i<board.length; i++){
            if(isValid(board,row,i)){
            board[row][i] = 'Q';
            boardMaker(board, row+1);
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

    public static char[][] solveNQueens(int n){
        char board[][] = new char[n][n];

        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        boardMaker(board,0);


        return board;
    }


    public static void main(String[] args) {
        solveNQueens(4);
    }
}
