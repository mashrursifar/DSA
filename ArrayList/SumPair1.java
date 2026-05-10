package ArrayList;

import java.util.ArrayList;

public class SumPair1 {

    public static boolean pairPossible(ArrayList<Integer> list, int target){

        int i=0, j= list.size()-1;

        while (i<j) {
            
            if(list.get(i)+list.get(j) == target) return true;

            if(list.get(i)+list.get(j) > target){
                j--;
            }else{
                i++;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(pairPossible(list, 9));
    }
    
}
