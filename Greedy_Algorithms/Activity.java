package Greedy_Algorithms;

import java.util.*;

public class Activity {

    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        List<Integer> l = new ArrayList<>();

        //1st Activity
        int mAct = 1;
        int endTime = end[0];
        l.add(0);

        for(int i=1; i<start.length; i++){
            if (start[i] >= endTime) {
                endTime = end[i];
                l.add(i);
                mAct++;
            }
        }
        System.out.println(mAct);
        for(int i=0 ; i<l.size(); i++){
            System.out.print("A"+l.get(i)+" ");
        }
        System.out.println();
    }
    
}
