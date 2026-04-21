package Recursion;

public class Friends {

    public static int friendsPair(int n){

        if(n==1 || n==2)
            return n;

        // Single person
        int sp = friendsPair(n-1);

        // One pair
        int p = (n-1)*friendsPair(n-2);

        int totalPair = sp + p;

        return totalPair;
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(3));
    }
}