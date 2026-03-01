public class trappingRainfall {

    public static void rainfallArea(int bars[]){

        int size = bars.length;
        int leftBoundary[] = new int[size];
        int rightBoundary[] = new int[size];
        leftBoundary[0] = bars[0];
        rightBoundary[size-1] = bars[size-1];

        for(int i=1; i<size;i++)
        {
            leftBoundary[i] = leftBoundary[i-1]<bars[i]?bars[i]:leftBoundary[i-1];
        }

        for(int i=size-2;i>=0;i--)
        {
            rightBoundary[i] = rightBoundary[i+1]<bars[i]? bars[i]:rightBoundary[i+1];
        }
        
        int waterTrap = 0;
        
        for(int i=0; i<size;i++)
        {
            waterTrap += Math.min(leftBoundary[i], rightBoundary[i]) - bars[i];
        }
       
        System.out.println("Total water trap while rainfall: "+waterTrap);
        
    }

    public static void main(String[] args) {
        int bar[] = {4,2,0,6,3,2,5};

        rainfallArea(bar);
    }
    
}
