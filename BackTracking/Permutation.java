package BackTracking;

public class Permutation {

    public static void findPermudation(String str,String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        
    for(int i=0;i<str.length();i++){

        char curr = str.charAt(i);
        String newStr = str.substring(0,i) + str.substring(i+1);

        // System.out.println("For loop i= "+i+" curr="+curr+" newStr= "+newStr+" str= "+str+" Ans= "+ans+curr);

        findPermudation(newStr, ans+curr);
    }
    }


    public static void main(String[] args) {
        String str = "abc";

        findPermudation(str,"");
    }
    
}
