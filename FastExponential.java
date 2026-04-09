public class FastExponential {
    
    public static int fPow(int a, int n){

        int result = 1;

        while (n>0) { 
            System.out.println("Entering Loop: \n a = "+a+" n= "+n+" result= "+result);
            if((n & 1 )!= 0){ 
                result = result  * a; 
            }

            a = a*a;
            n = n>>1;
        }


        return result;
    }
    public static void main(String[] args) {
        
        System.out.println(fPow(2,9));
    }
}
