import java.util.*;

public class FourSumArray {

    public static int[][] fourSum(int[] arr, int target) {

        Arrays.sort(arr);
        int n = arr.length;

        int[][] temp = new int[1000][4]; // temporary storage
        int count = 0;

        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){

                int left = j+1;
                int right = n-1;

                while(left < right){

                    long sum = (long)arr[i] + arr[j] + arr[left] + arr[right];

                    if(sum == target){

                        temp[count][0] = arr[i];
                        temp[count][1] = arr[j];
                        temp[count][2] = arr[left];
                        temp[count][3] = arr[right];
                        count++;

                        left++;
                        right--;

                    }else if(sum < target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        // copy exact size result
        int[][] result = new int[count][4];

        for(int i=0;i<count;i++){
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[] = {2,2,2,2,2,2,2};
        int target = 8;

        int[][] ans = fourSum(arr, target);

        for(int i=0;i<ans.length;i++){
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}