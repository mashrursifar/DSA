import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static  List<List<Integer>> threeSum(int arr[]){
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1; j<n-1; j++){
        //         // Append               
        //         List<Integer> l = new ArrayList<>();
        //         for(int k = j+1; k<n; k++){
        //             if(arr[i]+arr[j]+arr[k]==0){
        //                 l.add(arr[i]);
        //                 l.add(arr[j]);
        //                 l.add(arr[k]);
        //                 list.add(l);
        //             }
        //         }
                
        //     }
        // }
        Arrays.sort(arr);
        System.out.println("Array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int j,k;
        for(int i=0; i<n-2; i++){
            while (arr[i]==arr[i+1]) {
                i++;
            }
            j=i+1;
            k= n-1;

            while (j<k) {
                List<Integer> l = new ArrayList<>();
                if ((arr[i]+arr[j]+arr[k])==0) {
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[k]);
                        list.add(l);
                        System.out.println(arr[j]+" prev "+arr[j+1]);
                        // while (arr[k]==arr[k-1]) {
                        //     k--;
                        // }
                        k--;
                        // while (j<k && arr[j]==arr[j+1]) {
                        // j++;
                        // }
                }else if((arr[i]+arr[j]+arr[k])>0){
                    k--;
                }else{
                    
                    j++;
                }
                
            }
        }
        return list;
    }
    public static void main(String[] args) {
       
        int arr[] = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));
    }
}