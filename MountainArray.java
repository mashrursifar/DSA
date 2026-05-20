public class MountainArray {

    public static int solution(int arr[]){

        int l =0 , r = arr.length-1;

        while (l<=r) {
            int mid = l + (r-l)/2;

            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) {
                return mid;
            }

            if (arr[mid]<arr[mid+1]) {
                l=mid+1;
            }else{
                r = mid-1;
            }
            
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,3,3,4,6,10,5,2};

        System.out.println("Index = "+solution(arr));
    }
    
}
