package BackTracking;

public class Grid {
    public static int findGrid(int i,int j, int n, int m){
        if(i==n-1 && j==m-1 ){
            return 1;
        }else if(i==n || j == m){
            return 0;
        }

        int count = findGrid(i+1, j, n, m) + findGrid(i, j +1, n, m);

        return count;
    }

    public static void main(String[] args) {
        int n= 3, m=3;

        System.out.println(findGrid(0, 0, n, m));
    }
    
}
