public class Tp {

    public static int water(int height[]){
        int n = height.length;
        int max=0;

        int r[] = new int[n], l[] = new int[n];

        r[n-1] = height[n-1];
        l[0] = height[0];

        for(int i=1; i<n; i++){
            l[i] = height[i]<l[i-1] ? l[i-1]:height[i];
        }

        for(int i=n-1; i>0; i--){
            r[i-1] = height[i-1]<r[i]?r[i]:height[i-1]; 
        }

        for(int i=0; i<n; i++){
            
            int water = Math.min(l[i], r[i]) - height[i];
            max += water;
        }


        return max;
    }

    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(water(height));
    }
    
}
