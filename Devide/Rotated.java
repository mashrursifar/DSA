package Devide;

public class Rotated {

    public static int solve(int arr[],int target){

        int left = 0;
        int right = arr.length-1;
        
        while (left<=right) {
            int mid = left + (right-left)/2;
            System.out.println(arr[mid]);

            if(target == arr[mid]) {
               
                return mid;
            }

            if(arr[left] <= arr[mid] ){
                
                if(target < arr[mid] && target >= arr[left]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }

            }else{

                if (target > arr[mid] && target <= arr[right] ) {
                    left = mid+1;
                }else{
                    right = mid-1;
                    
                }
            }
            
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,2};

        System.out.println(solve(arr, 5));
    }
    
}
