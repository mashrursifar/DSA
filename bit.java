public class bit {
    public static void getBit(int x,int i){

        int a = 1<<i;
        int bit = x & a;
        
        bit = bit==0?0:1;

        System.out.println(i+"th bit is "+bit);

    }

    public static int setBit(int x, int i){
        int a = 1<<i;

        return x | a;

    }
    public static int clearBit(int x, int i){

        return x & ~1<<i;

    }
    


    public static void main(String[] args) {
        
        int x = 10;

        System.out.println(clearBit(x, 1));
    }
}
