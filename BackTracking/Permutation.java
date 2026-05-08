package BackTracking;

public class Permutation {

    public static void findPermudation(String str,String ans,int i){

        if(i == str.length()){
            System.out.println(ans);
            return;
        }

        findPermudation(str, ans+str.charAt(i), i+1);
        findPermudation(str, ans+str.charAt(i), i+1);
        findPermudation(str, ans+str.charAt(i), i+1);
    }


    public static void main(String[] args) {
        String str = "abc";

        findPermudation(str,"",0);
    }
    
}
