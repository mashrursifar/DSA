package Recursion;

public class Fibonacci {

    public static int fib(int n){
        
        if(n == 0 || n == 1){
            return n;
        }

        int fn1 = fib(n-1);
        int fn2 = fib(n-2);

        int fib = fn1 + fn2;

        return fib;
    }
    
    public static void main(String[] args) {
        System.out.println(fib(30));
    }
}
