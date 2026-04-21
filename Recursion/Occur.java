package Recursion;

public class Occur {
    public static void found(int arr[], int key, int idx){
        if(idx== arr.length){
            return;
        }

        if(arr[idx] == key){
            System.out.print(idx+" ");
        }
        found(arr, key, idx+1);


    }
    public static void main(String[] args) {
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        
        found(arr, 2, 0);
    }
}
