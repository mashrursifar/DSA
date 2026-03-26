import java.util.Arrays;

public class NextPermutaion {
    
        public static void next(int arr[]){
            int n = arr.length-1;
            int i=n;
            int pivot = -1;

            while (i>0) {
                if(arr[i]>arr[i-1]){
                    pivot = i-1;
                    break;
                }
                i--;
            }
            System.out.println(pivot);
            

            if(pivot==-1){
                Arrays.sort(arr);
                return;
            }

            i=n;
            
            while (i>=pivot) {
                if (arr[pivot]<arr[i]) {
                    int temp = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = temp;
                    break;
                }
                i--;
            }


            pivot++;
            while (n>pivot) {
                int temp = arr[pivot];
                arr[pivot] = arr[n];
                arr[n] = temp;
                n--;
                pivot++;
            }

            
        }


    public static void main(String[] args) {
        int arr[] = {1,3,2};

        next(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
}
