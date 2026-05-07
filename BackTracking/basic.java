package BackTracking;


public class basic {

    public static void backtracking(int arr[], int idx, int n){

        if(idx==arr.length){
            printArr(arr);
            return;
        }

        arr[idx] = n;
        backtracking(arr, idx+1, n+1);
        arr[idx] = arr[idx]-2; //Backtracking 


    }

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];

        backtracking(arr,0,1);
        printArr(arr);
    }
    
}
