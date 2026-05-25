package Stack_;
import java.util.*;
public class StockSpan {
    
    public static void calculateSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();

        span[0] = 1;
        s.push(0);
        int prevHigh = s.peek();

        for(int i=1; i<stock.length; i++){
            int curPrice = span[i];

            while (!s.isEmpty() && curPrice > stock[s.peek()]) {
                s.pop();
                prevHigh = s.peek();
            }

            if (s.isEmpty()) {
                span[i] = i+1;
            }else{
                span[i] = i - prevHigh;
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        calculateSpan(stock,span);

        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
