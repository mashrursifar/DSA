public class spiralArray {
    public static void spiralPrint(int matrix[][]){

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            System.out.print(matrix[i][j]+" ");
        }
        }


    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        spiralPrint(matrix);
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
    
    }
}