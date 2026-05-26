package Stack_;

import java.util.Stack;

public class next2 {
    
    public static void solution(int arr[], int nextG[]){
        int n = arr.length;
        int nextL[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i =n-1; i>=0; i--){

            while (!s.isEmpty()) {
                if (arr[s.peek()] >arr[i]) {
                    break;
                }else{
                    s.pop();
                }
            }

            if (s.isEmpty()) {
                nextG[i] = -1;
            }else{
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int nextG[] = new int[arr.length];

        solution(arr,nextG);
        for(int i=0; i<nextG.length; i++){
            System.out.print(nextG[i]+" ");
        }
    }
}
