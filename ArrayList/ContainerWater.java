package ArrayList;
import java.util.*;
public class ContainerWater {

    public static int waterArea(ArrayList<Integer> list){
        int maxWater = 0;

        int i =0, j= list.size()-1;

        while (i<j) {
            int width = j-i;
            int height = Math.min(list.get(i),list.get(j));
            int curWater = width * height;

            maxWater = Math.max(curWater,maxWater);

            if(list.get(i)<list.get(j)){
                i++;
            }else{
                j--;
            }

        }


        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(waterArea(list));
    }
    
}
