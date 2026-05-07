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

        if(target<=arr[mid]){
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }else{
                return search(arr, target, mid+1, ei);
            }
            
        }else{
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {5,6,7,0,1,2,3,4};
        System.out.println(search(arr, 7, 0, arr.length-1));
    }
    
}
