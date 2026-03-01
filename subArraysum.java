public class subArraysum {
    
    public static void subarrSum(int arr[])
    {
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];

        // Calculating prefix array
        for(int i=0; i<prefix.length;i++)
        {
            prefix[i]= prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length;i++)
        {
            for(int j=i; j<arr.length;j++)
            {
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,4};
        subarrSum(arr);
    }
}
