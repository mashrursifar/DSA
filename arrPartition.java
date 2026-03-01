import java.util.Arrays;

public class arrPartition {

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {System.out.print(arr[i]+" ");} 
        System.out.println();
    }


    public static int maxSum(int arr[])
    {
        int maxSum = 0;

        Arrays.sort(arr);
        printArray(arr);
        for(int i=0; i<arr.length;i++)
        {
           maxSum += Math.min(arr[i], arr[i+1]);
           i++; 
        }
        

        return maxSum;
    }

    public static void main(String[] args) {
        int array[] = {6,2,6,5,1,2};

        int res = maxSum(array);
        System.out.println(res);

    }
    
}
