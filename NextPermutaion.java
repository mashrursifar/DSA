public class NextPermutaion {
    
        public static int[] next(int arr[]){
            int n = arr.length-1;
            int i=n;
            int pivot = n-1;

            while (i>pivot && pivot>=0 && i>=0) {
                
                if(arr[pivot]<arr[i]){
                    pivot--;
                    int temp = arr[pivot];
                    arr[pivot] = arr[n];
                    arr[n] = temp;
                }else{
                    pivot--;
                    i--;
                }
            }

            return arr;
        }


    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        next(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
