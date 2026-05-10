package ArrayList;

import java.util.ArrayList;



public class TwoDArrayLlist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            l1.add(1*i);
            l2.add(2*i);
            l3.add(3*i);
        }
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(list);
        
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    
    
}
