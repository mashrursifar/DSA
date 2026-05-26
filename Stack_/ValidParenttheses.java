package Stack_;

import java.util.Stack;

public class ValidParenttheses {

    public static boolean checkParentheses(String str){
        char cur = str.charAt(0);
        Stack<Character> s = new Stack<>();
        s.push(cur);

        if (cur == '(' || cur == '{' || cur == '[') {

            for(int i=1; i<str.length(); i++){
                cur = str.charAt(i);
                if (cur == '(' || cur == '{' || cur == '[') {
                    s.push(cur);
                }else{
                    // If first element is )}] then false
                    if (s.isEmpty()) {
                        return false;
                    }
                    
                    char top = s.peek();
                    if ((top == '(' && cur == ')') || (top == '[' && cur == ']')
                        || (top == '{' && cur == '}')) {
                            
                            s.pop();
                        
                    }else{
                        return false;
                    }
                }
                

            }    
        }else{
            return false;
        }

        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "){{{(())}}{[[]]}}())";

        System.out.println(checkParentheses(str));
    }
    
}
