import java.lang.reflect.Array;
import java.util.Arrays;

public class majority {
    
    public static void maximum(int nums[]){

        int n = nums.length, count = 1;


        Arrays.sort(nums);
        int maxNum = nums[0];

        for(int i=1;i<n;i++){

            if(nums[i] == nums[i-1]){
                count++;
                maxNum = nums[i-1];
            }
        }
        
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};

        maximum(nums);
    }
}
