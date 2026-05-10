package ArrayList;

import java.util.ArrayList;

public class SumPair2 {

    public static boolean pairPossible(ArrayList<Integer> list, int target){

        int n = list.size(), pivot=0;

        for(int i =0; i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp= pivot+1 , rp = pivot;

        while (lp!=rp) {

            if(list.get(lp) + list.get(rp) == target) return true;

            if(list.get(lp)+list.get(rp)<target){
                lp = (lp +1)%n;
            }else{
                rp = (rp + n -1)%n;
            }
            
        }


        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairPossible(list, 14));
    }
    
}
