package Recursion;

public class OptimizerPower {
    public static int pow(int x, int n){
        if(n==0)return 1;

        int half = pow(x, n/2);
        int halfsq = half*half;

        if(n%2 != 0){
            halfsq = x*halfsq;
        }
        return halfsq;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,5));
    }
}