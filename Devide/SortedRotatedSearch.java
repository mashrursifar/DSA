package Devide;

public class SortedRotatedSearch {

    public static int search(int arr[],int target, int si,int ei){
        int mid = si +(ei-si)/2;

        if(si>ei){
            return -1;
        }

        if(arr[mid]==target){
            return mid;
        }

        if(arr[si] < arr[mid]){
            if (target < arr[mid] && target >= arr[si]) {
                return search(arr, target, si, mid-1);
            }else{
                return search(arr, target, mid+1, ei);
            }
        }else{
            if(target > arr[mid] && target <= arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
        
    }
    
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8,1,2,3};
        System.out.println(search(arr, 8, 0, arr.length-1));
    }
    
}
