package Greedy_Algorithms;

import java.util.*;

public class Activity {

    // If the ending time is already Sorted
    public static void activityFind(int start[], int end[]){
        
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

    // If the ending time is not sorted
    public static void actFind(int start[], int end[]){

        List<Integer> l = new ArrayList<>();

        int arr[][] = new int[start.length][3]; //index, start time, end time -> columns

        for(int i=0; i<start.length; i++){
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        // Comparator is an interface for sorting objects in java
        Arrays.sort(arr, Comparator.comparingDouble(o->o[2])); //lmda function is used for defining column


        // 1st time 
        int mAct = 1;
        int endTime = arr[0][1];
        for(int i=0; i<start.length; i++){

            System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]);
        }
    }
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        actFind(start, end);
    }
    
}
