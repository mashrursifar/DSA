package Stack_;

import java.util.Stack;

public class NextGreaterElement {

    public static void nextGreater(int arr[], int nexG[]){
        Stack<Integer> s = new Stack<>();
        int n = arr.length-1;
        for(int i=n; i>=0; i--){
            // 
            while (!s.isEmpty()) {
                if (arr[s.peek()] <= arr[i]) {
                    s.pop();
                }else{
                    break;
                }
            }

            if(s.isEmpty()){
                nexG[i] = -1;
            }else{
                nexG[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nexG[] = new int[arr.length];

        nextGreater(arr,nexG);

        for(int i=0; i<nexG.length; i++){
            System.out.print(nexG[i]+" ");
        }
    }
    
}
