package Devide;

public class SortedRotatedSearch {

    public static int search(int arr[],int target, int si,int ei){

        int mid = si +(ei-si)/2;

        if(arr[mid]==target){
            return mid;
        }

        if(target<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid);
            }else{
                return search(arr, target, mid, ei);
            }
            
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid, ei);
            }else{
                return search(arr, target, si, mid);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,7,0,1,2,3,4};
        search(arr, 4, 0, arr.length);
    }
    
}
