package BackTracking;

public class nQueens {
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

    public static void queens(char chess[][],int row){

        if(row==chess.length){
            printArr(chess);
            return;
        }
        for(int j=0;j<chess.length;j++){
            chess[row][j] = 'Q';
            queens(chess, row+1);
        }

    }
    public static void main(String[] args) {
        int n=2;
        char chess[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chess[i][j] = 'x';
            }
        }

        queens(chess, 0);
        // printArr(chess);

    }
}
