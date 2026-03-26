import java.util.Arrays;

public class NextPermutaion {
    
        public static int[] next(int arr[]){
            int n = arr.length-1;
            int i=n;
            int pivot = n-1;
            boolean con = true;

            while (i>pivot && pivot>=0 && i>=0) {
                
                if(arr[pivot]<arr[i]){
                    con = false;

                    // if(arr[i]>arr[n]){
                    //     n--;
                    //     continue;
                    // }

                    int temp = arr[pivot];
                    arr[pivot] = arr[n];
                    arr[n] = temp;
                    
                    while (i<=n) {
                        
                        temp = arr[i];
                        arr[i] = arr[n];
                        arr[n] = temp;
                        i++;
                        n--;
                    }
                    break;
                }else{
                    pivot--;
                    i--;
                }
                
                
            }
            if(con == true){
                    Arrays.sort(arr);
                }
            return arr;
        }


    public static void main(String[] args) {
        int arr[] = {1,4,3,2};

        next(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
