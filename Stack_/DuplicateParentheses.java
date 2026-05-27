package Stack_;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        char ch = str.charAt(0);
        int n = str.length();
        int count =-1;

        if (ch == '(') {
            s.push(ch);

            for(int i=1; i<n; i++){
                ch = str.charAt(i);
                s.push(ch);
                if (ch == ')') {
                    char top = s.peek();
                    while (!s.isEmpty() && !(top == '(')) {
                        s.pop();
                        top = s.peek();
                        count++;
                    }
                    s.pop();
                    System.out.println(count+" count");
                    if(count<1) return true;
                }
                count = -1;
                
            }
        }
        
        return false;
        
    }
    public static void main(String[] args) {
        String str = "((a+b)+((a-b)))";

        System.out.println(isDuplicate(str));
    }
    
}
