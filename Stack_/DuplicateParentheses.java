package Stack_;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean isDuplicate(String str){
        int n = str.length();
        if(n==0)return false;
        Stack<Character> s = new Stack<>();
        char ch = str.charAt(0);
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
                    
                    if(count<1) return true;
                }
                count = -1;
                
            }
        }else{
            return true;
        }


        if(!s.isEmpty()) return true;

        return false;
        
    }
    public static void main(String[] args) {
        String str = "((((a)+(b))+c+d))";

        System.out.println(isDuplicate(str));
    }
    
}
