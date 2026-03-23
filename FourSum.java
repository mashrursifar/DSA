import java.util.*;

public class FourSum {
    
    public static List<List<Integer>> sum(int arr[],int target){
        
        List<List<Integer>> restult = new ArrayList<>();

        Arrays.sort(arr);

        for(int i=0; i<arr.length-3;i++){

            if(i>0 && arr[i] == arr[i-1]) continue;

            for(int j=i+1; j<arr.length-2; j++){
                
                if(j>i+1 && arr[j] == arr[j-1]) continue;

                int left = j+1, right = arr.length-1;

                while (left<right) {
                    long tg = (long)arr[i]+ arr[j] + arr[left] + arr[right];

                    if(tg == target){
                        restult.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));

                        left++;
                        right--;

                        while (left<right && arr[left]== arr[left-1]) left++;

                    }else if(target>tg){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
        }

        return restult;
    }

    public static void main(String[] args) {
        
        int arr[] = {-2,-1,-1,1,1,2,2};
        int target = 0;

       System.out.println(sum(arr, target));
    }
}
 
