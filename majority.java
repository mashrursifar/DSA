public class majority {
    
    public static void maximum(int nums[]){

        int n = nums.length;
        int freq[] = new int[n];
        int maxNum =0;

        for(int i=0; i<n; i++){

            freq[nums[i]]++;
        }


       int max = Integer.MIN_VALUE;
       

        for(int i=0; i<n; i++){
            
            if(freq[i]>max){
                max = freq[i];
                maxNum = i;
            }
            
        }

        System.out.println(maxNum +" is majority number which occurs "+max+" times");
        
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};

        maximum(nums);
    }
}
