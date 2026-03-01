public class subArraysum {
    // Prefix Array
    public static void subarrSum(int arr[])
    {

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
        System.out.println("Maximum sum = "+max);
    }
    public static void main(String[] args) {

        int arr[] = {6,-2,6,-1,-3,10};
        subarrSum(arr);

    }
}
