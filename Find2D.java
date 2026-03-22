
public class Find2D {


    public static boolean searchMatrix(int[][] matrix, int target) {
        

        int n=matrix.length-1, m = matrix[0].length-1;

        int i=0, j=m;
        while (i<=n && j>=0) {

            

            if(matrix[i][j]==target){
                return true;
            }else if(matrix[i][j]>target){
                j--;
            }else{
                i++;
            }

        }

        

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};

        int target = 8;
        boolean f = searchMatrix(matrix, target);
        System.out.println(f);

        
    }
    
}
