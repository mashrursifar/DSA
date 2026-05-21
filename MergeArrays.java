public class MergeArrays {
    
    public static void merge(int nums1[],int m, int nums2[], int n){
        if(n==0) return;
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int i=0,j=0,k=0;
        while (i<m) {
            if (nums1[i] < nums2[j]) {
                i++;
            }else{
                int tmp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = tmp;
                i++;
                if ( j<n-1 && nums2[j]>nums2[j+1] ) {
                    j++;
                    
                }
            }
        }
        
        int x =j;
        if(j==0){
            while (j<n) {
            nums1[i] = nums2[j];
            j++;
            i++;
        }
        }else{
            while (k<x && j<n) {
                if (nums2[k]<nums2[j] ) {
                    nums1[i] = nums2[k];
                    i++;
                    k++;
                }else {
                    nums1[i] = nums2[j];
                    j++;
                    i++;
                }
            }
        }
        if (k<x) {
            while(k<x){
                
                nums1[i] = nums2[k];
                        i++;
                        k++;
            }
        }else{
            while(j<n){
                
                nums1[i] = nums2[j];
                        j++;
                        i++;
            }
        }
    }
    public static void main(String[] args) {
        int nums1[] = {4,0,0,0,0,0};
        int nums2[] = {1,2,3,5,6};

        merge(nums1,1,nums2,5);

        for(int i = 0; i<nums1.length; i++){
            System.out.print(nums1[i]+" ");
        }
    }
}