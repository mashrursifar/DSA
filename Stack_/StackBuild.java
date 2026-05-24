package Stack_;

import java.util.*;
public class StackBuild {
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
        if(isEmpty()) return -1;

        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    // peek
    public  int peek(){
                if(isEmpty()) return -1;

                return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        StackBuild s = new StackBuild();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
