import java.util.Arrays;

public class Lights {
    
    // max(0, i - v) to min(n - 1, i + v)already have
    // max(0, j - 1) to min(n - 1, j + 1)New insert

    public static int Solve(int arr[]){
        int count =0 ;
        int n = arr.length;
        int initial=0, end = n-1;
        boolean idx[] = new boolean[n];

        for(int i=0; i<n; i++){
            if (arr[i]!=0) {
                int v = arr[i];
                initial = Math.max(0,i-v);
                end = Math.min(n-1, i+v);
                System.out.println(initial+"  "+end);

                arr[i] = n+2;
                while (initial<=end) {
                    if(initial==i) continue;

                    if(arr[initial] != 0 ){

                    }
                    arr[initial] = n+2;
                    initial++;
                }
                
            }
        }

        return count;
    }


    public static String[] easy(int m, int n){

        char arr[][] = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], '#');
        }

        
        for (int j = 0; j < n; j++) {
            arr[0][j] = '.';
        }

      
        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = '.';
        }
        String[] sol = new String[m];
        for (int i = 0; i < m; i++) {
            sol[i] = new String(arr[i]);
        }

        return sol;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,0};

        // System.out.println(Solve(arr));
        String s[] = easy(1, 1);
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}