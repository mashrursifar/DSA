package Recursion;

import java.util.*;

public class CombinationSum {

    public static void solve(List<List<Integer>> l, List<Integer> s, int idx, int arr[], int target, int n){
        
        if(target == 0){
            l.add(new ArrayList<>(s));
            return;
        }
        if (idx >= n || target<0) return;
        

        s.add(arr[idx]);
        solve(l, s, idx, arr, target-arr[idx],  n);
        s.remove(s.size()-1);
        
        solve(l, s, idx+1, arr, target, n);




    }
    public static List<List<Integer>> findComb(int arr[], int target){
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        int n = arr.length;

        solve(l, s,0, arr, target, n);
        
        return l;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7};

        System.out.println(findComb(arr, 7));
    }
    
}
