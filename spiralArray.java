public class spiralArray {
    public static void arrPrint(int matrix[][]){
        System.out.println("");
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
// hudai again

    public static void spiralPrint(int matrix[][]){

        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;
        int rowStart = 0, colStart = 0;


        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            // Top
            for(int i = colStart;i<=colEnd;i++){
                
                System.out.print(matrix[rowStart][i]+" ");
            }

            // Right
            for(int i= rowStart+1; i<=rowEnd; i++){
                
                System.out.print(matrix[i][colEnd]+" ");
            }

            // Bottom
            for(int i= colEnd-1; i>=colStart; i--){
                if(rowEnd==rowStart)return;
                System.out.print(matrix[rowEnd][i]+" ");
            }

            // Left
            for(int i= rowEnd-1;i>rowStart;i--){
                if(colEnd== colStart)return;
                System.out.print(matrix[i][colStart]+" ");
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        System.out.println();


    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        spiralPrint(matrix);
        
        arrPrint(matrix);
    
    }
}