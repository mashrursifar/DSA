package Stack_;

import java.util.*;
public class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    // check empty
    public static boolean isEmpty(){
        return list.size() == 0;
    }

    // Push
    public  void push(int data){
        list.add(data);
    }
    // Pop
    public  int pop(){

        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    // peek
    public  int peek(){
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
