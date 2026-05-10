package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){

        Integer temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);


        System.out.println(list);

        list.set(3, 199);
        System.out.println(list);

        swap(list,1,3);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
    
}
