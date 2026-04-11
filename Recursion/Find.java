package Recursion;

public class Find {

    public static int firstOccurance(int arr[], int key, int i){
        if(i>arr.length-1)
            return -1;

         if(arr[i] == key){
            return i;
         }
         

        return firstOccurance(arr, key,i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,3,2,4,5,3};
        System.out.println(firstOccurance(arr, 9, 0));
    }
    
}
