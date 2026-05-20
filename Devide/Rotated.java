package Devide;

public class Rotated {

    public static int solve(int arr[],int target){

        int left = 0;
        int right = arr.length-1;
        int mid = left + (right-left)/2;
        while (left<=right) {

            if(arr[mid] == target) return mid;

            if(arr[mid] > target && arr[left] <= target){
                right = mid-1;
                mid = left + (right-left)/2;
            }else if(arr[mid] > target && target < arr[left]){
                left = mid+1;
                mid = left + (right-left)/2;
            }
            else if(arr[mid] < target && arr[right] >= target){
                left = mid+1;
                mid = left + (right-left)/2;
            }else if(arr[mid] < target && target > arr[right]){
                right = mid-1;
                mid = left + (right-left)/2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,1,2,3};

        System.out.println(solve(arr, 8));
    }
    
}
