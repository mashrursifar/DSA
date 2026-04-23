package  Recursion;

public class BinaryString {

    public static void binary(int n, String str, int pre){

        if( n==0){
            System.out.println(str);
            return;
        }

        if(pre==1){
            binary(n-1, str+'0', 0);
        }else{
            binary(n-1, str+'0', 0);
            binary(n-1, str+'1', 1);
        }

    }

    public static void main(String[] args) {
        binary(3, "", 0);
    }
}