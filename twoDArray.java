import java.util.Scanner;
public class twoDArray {

    public static void maxMin(int matrix[][])
    {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i =0;i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                max = max < matrix[i][j]? matrix[i][j]: max;
                min = min > matrix[i][j]? matrix[i][j]: min;
                
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }

    public static void main(String[] args) {
        
        int matrix[][] = new int[3][3];

        int m = matrix.length, n = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i =0;i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        maxMin(matrix);



        sc.close();
    }
}
