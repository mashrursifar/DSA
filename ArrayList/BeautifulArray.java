package ArrayList;

import java.util.ArrayList;

public class BeautifulArray {
    public static void array(int n){
        ArrayList<Integer> list = new ArrayList<>();

        
        list.add(1);
       
        for(int i=1; i<=n; i++){
            ArrayList<Integer> tmp = new ArrayList<>();

            int size = list.size();

            for(int j=0; j<size; j++){
                
                int temp = list.get(j)*2 -1 ;
                tmp.add(temp);
            }

            for(int j=0; j<size; j++){
                int temp = list.get(j)*2;
                tmp.add(temp);
            }

           int xy = i;
            tmp.removeIf(x-> x>xy);
            System.out.println(tmp);

        
            list = tmp;
            
        }
        System.out.println(list);
    }

   

    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        array(27);
       
    }
}