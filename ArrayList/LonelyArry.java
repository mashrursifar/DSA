package ArrayList;
import java.util.*;

public class LonelyArry {

    public static List<Integer> lonely(int nums[]){
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        if(n==1){
            list.add(nums[0]);
        }
        for(int i=0; i<n; i++){

            if(i==n-1){
                if(nums[i]!=nums[i-1] && nums[i] != nums[i-1]+1){
                    list.add(nums[i]);
                }
                continue;
            }
            if(i==0){
                if(nums[i]!=nums[i+1] && nums[i] != nums[i+1]-1){
                    list.add(nums[i]);
                }
                continue;
            }

            if(nums[i]!=nums[i+1] && nums[i] != nums[i+1]-1 && nums[i]!=nums[i-1] && nums[i] != nums[i-1]+1){
                list.add(nums[i]);
                
            }

            

        }

        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,3};

        System.out.println(lonely(nums));
    }
}
