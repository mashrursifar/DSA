public class SearchMountainArray {
    public static int findPeak(int arr[]){
        
    }
    public static int solution(int arr[], int target){
        int peak = findPeak(arr);

        if (arr[peak] == target) {
            return peak;
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
        int arr[] = {1,2,3,4,5,3,1};

        System.out.println(solution(arr));
    }
}
