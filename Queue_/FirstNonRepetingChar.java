package Queue_;

import java.util.*;

public class FirstNonRepetingChar {
    
    public static void findNonRepeting(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        StringBuilder s = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
            q.add(ch);

            while (!q.isEmpty()) {
                if (freq[q.peek()-'a']==1) {
                    s.append(" "+q.peek());
                    break;
                }else{
                    q.remove();
                }
            }
            if (q.isEmpty()) {
                s.append(" -1");   
            }


        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        String str = "aabccxb";

        findNonRepeting(str);
    }
}
