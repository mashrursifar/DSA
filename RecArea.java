import java.util.Stack;

public class RecArea {

    public static int area(int h[]){
        int area = Integer.MIN_VALUE;
        int n = h.length;
        int nextSL[] = new int[n];
        int nextSR[] = new int[n];
        
        Stack<Integer> s = new Stack<>();

        for(int i=n-1; i>=0; i--){
           
            while (!s.isEmpty()) {
                 if (h[s.peek()] >= h[i]) {
                    s.pop();
                }else{
                    break;
                }
            }

            if(s.isEmpty()){
                nextSR[i] = -1;
            }else{
                nextSR[i] = s.peek();
            }

            s.push(i);
        }
        while (!s.isEmpty()) {
            s.pop();
        }


        for(int i=0; i<n; i++){
           
            while (!s.isEmpty()) {
                 if (h[s.peek()] >= h[i]) {
                    s.pop();
                }else{
                    break;
                }
            }

            if(s.isEmpty()){
                nextSL[i] = -1;
            }else{
                nextSL[i] = s.peek();
            }

            s.push(i);
        }

        // for(int i=0;i<n;i++){
        //     System.out.print(nextSL[i]+" ");
        // }
        // System.out.println();

        for(int i=0; i<n; i++){
            int idxL=nextSL[i],idxR;
            idxR = nextSR[i]==-1?n:nextSR[i];

            int tmp = h[i]*(idxR-idxL-1);
            area = area>tmp?area:tmp;
        }

        return area;
    }
    public static void main(String[] args) {
        int h[] = {2,1,5,6,2,3};

        System.out.println(area(h));
    }
}