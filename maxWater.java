public class maxWater {
    
    public static int water(int heights[]){
        // 0(n^2)

        int max = Integer.MIN_VALUE ,waterLevel =0;
        int n = heights.length;

        for(int i=0; i<n-1; i++){
            
            for(int j=i+1; j<n; j++){
            
                waterLevel = Math.min(heights[i], heights[j])*(j-i);

                max = max<waterLevel? waterLevel:max;
            }
        }
    
        return max;
    }

    public static int mWater(int heights[]){
        // 0(n)
        int max = Integer.MIN_VALUE;

        int i=0, j= heights.length-1;

        while (i<j) {

            int waterLevel = Math.min(heights[i],heights[j])*(j-i);
            max = max<waterLevel? waterLevel:max;

            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
            
            
        }

        return max;
    }
    public static void main(String[] args) {
        int heights[] = {1,8,5,4,3,8,5,2,7};

        System.out.println(mWater(heights));
    }
}
