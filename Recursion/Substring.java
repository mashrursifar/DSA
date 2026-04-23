package Recursion;

public class Substring {

    public static int countSubstring(String str, int count,int start, int end){
       
        if(end >= str.length()){
            return count;
        }

        if(str.charAt(start)==str.charAt(end)){

            count++;
      
            countSubstring(str, count, start, end+1);
        }

        return countSubstring(str, count, start, end+1);
    }

    public static void main(String[] args) {
        String s = "abcab";

        System.out.println(countSubstring(s, 0, 0, 0));
    }
    
}
