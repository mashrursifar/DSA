package Recursion;

public class Fact {

    public static int factorial(int n){
        int fact =1;

        if(n==1){
            return 1;
        }
        fact = n *factorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
