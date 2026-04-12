package Recursion; 

public class tileFilling {
    public static int tileNumber(int n){

        if(n==0 || n ==1){
            return 1;
        }

        int verticalNumber = tileNumber(n-1);
        int horizontalNumber = tileNumber(n-2);
        int totalways = verticalNumber + horizontalNumber;

        return totalways;
    }

    public static void main(String[] args) {
        System.out.println(tileNumber(4));
    }
    
}
