package Stack_;

import java.util.Stack;

public class next2 {
    public static void checkLeft(int arr[], int nextG[], int i){
        for(int j=0;j<i; j++){
            if (arr[j] > arr[i] ) {
                nextG[i] = arr[j];
                return;
            }
        }

    }
    public static void solution(int arr[], int nextG[]){
        int n = arr.length, max = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<n; i++){
            max = max>arr[i]?max:arr[i];
        }
        
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
                if (arr[i]<max) {
                    checkLeft(arr,nextG,i);
                }

            }else{
                nextG[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,6,1,5,4,3,1};
        int nextG[] = new int[arr.length];

        solution(arr,nextG);
        for(int i=0; i<nextG.length; i++){
            System.out.print(nextG[i]+" ");
        }
    }
}
