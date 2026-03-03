package Sorting;
public class insertionSorting {

    public static void insertionSort(int arr[])
    {
       for(int i=1;i<arr.length;i++) 
       {
        int curr = arr[i];
        int prev = i-1;
        // FInding out the correct position to insert
        while (prev>=0 && arr[prev] > curr) {
            arr[prev+1] = arr[prev];
            prev--;
            
        }
        // Inertion
        arr[prev+1] = curr;

       }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,7,3,1,2,-2};

        insertionSort(arr);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
    }
    
}
