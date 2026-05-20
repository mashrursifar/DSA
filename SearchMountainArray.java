public class SearchMountainArray {
    public static int findPeak(int arr[]){
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
        return 0;
    }
    public static int left(int arr[], int peak, int target){

        int l=0,r= peak;

        while (l<=r) {

            int mid= l+(r-l)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if(target < arr[mid]) r = mid-1;

            if(target > arr[mid]) l = mid + 1;
            
        }

        return -1;
    }

    public static int right(int arr[], int peak, int target){

        int l=peak,r= arr.length-1;

        while (l<=r) {

            int mid= l+(r-l)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if(target > arr[mid]) r = mid-1;

            if(target < arr[mid]) l = mid + 1;
            
        }

        return -1;
    }

    public static int solution(int arr[], int target){
        int peak = findPeak(arr);

        if (arr[peak] == target) {
            return peak;
        }else if(target > arr[peak]){
            return -1;
        }

        int found = left(arr,peak-1,target);

        if (found == -1) {
            found = right(arr,peak+1,target);
        }
        if(found != -1){
            return found;
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {0,5,3,1};

        System.out.println(solution(arr,1));
    }
}
