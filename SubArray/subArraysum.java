package SubArray;
public class subArraysum {
    // Prefix Array
    public static void subarrSum(int arr[])
    {
        // complexity O(n^2)
        int prefix[] = new int[arr.length];
        int curSum=0, max=Integer.MIN_VALUE;
        prefix[0] = arr[0];

        // Calculating prefix array
        for(int i=1; i<prefix.length;i++)
        {
            prefix[i]= prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                curSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(max<curSum){
                    max = curSum;
                }
                // System.out.println("Current Sum = "+ curSum);
            }
        }
        System.out.println("Maximum sum: "+max);
    }

    public static void kadanes(int arr[])
    {
        // Time complexity O(n)

        int curSum=0, maxSum=Integer.MIN_VALUE;

        int neg = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {   
            neg = neg<arr[i] ? arr[i]:neg;
            
            curSum += arr[i];
            if (curSum>maxSum) {
                maxSum  = curSum;
            }else if(curSum<0)
            {
                curSum =0;

            }
            
        }
        // maxSum = maxSum>neg? maxSum:neg;

         System.out.println("Maximum sum: "+maxSum);
    }
    public static void main(String[] args) {

        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        subarrSum(arr);
        kadanes(arr);

    }
}
