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
        
        for(int col=0;col<chess.length;col++){
            
            if(isValid(chess,row,col)){
            
                chess[row][col] = 'Q';
                queens(chess, row+1);
                chess[row][col] = 'x';}
            
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
        for(int i=row-1,j=col; i>=0; i--,j--){
            if(chess[i][j]=='Q')
                return false;
        }

        // Upper Right
        for(int i=row-1,j=col; i>=0; i--,j++){
            if(chess[i][j]=='Q')
                return false;
        }


        return true;
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
