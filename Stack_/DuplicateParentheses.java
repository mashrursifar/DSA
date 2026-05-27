package Stack_;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        char ch = str.charAt(0);

        if (ch == '(' || ch == '[' || ch == '{') {
            for(int i =1; i< str.length(); i++){

                s.push(ch);
                

                if (ch == ')' || ch == '}' || ch == ']') {
                    while (!s.isEmpty() && !(ch == '(' || ch == '[' || ch == '{')) {
                        System.out.println(s.peek()+" Pop");
                        s.pop();
                        ch = s.peek();

                    }
                    s.pop();
                    System.out.println(s.peek()+" peek now after pop");
                }
                ch = str.charAt(i);
            }
            
            
        }
        System.out.println(s.peek()+" last");
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+(b-c))";

        System.out.println(isDuplicate(str));
    }
    
}
