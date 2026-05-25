package Stack_;
import java.util.*;;
public class next {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> s = new Stack<>();
        int n = nums2.length;
        int j=nums1.length;
        int g[] = new int[10001];
        

        for(int i=n-1; i>=0; i--){
            
            while(!s.isEmpty()){
                if(nums2[i] >= nums2[s.peek()]){
                    s.pop();
                }else{
                    break;
                }
                

            }
            if(s.isEmpty()){
                g[nums2[i]] = -1;
            }else{
                g[nums2[i]] = nums2[s.peek()];
            }
            System.out.println(g[nums2[i]]);
            s.push(i);
            
        }
        for(int i=0; i<j ; i++){
            nums1[i] = g[nums1[i]];
        }
        return nums1;
    }
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        int x[] =nextGreaterElement(nums1,nums2);
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
    
}
