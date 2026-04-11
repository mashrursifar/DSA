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

    public static int lastOccurance(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }

        int isFound = lastOccurance(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,3,2,4,5,33,4,2,1};
        System.out.println(lastOccurance(arr, 3, 0));
    }
    
}
