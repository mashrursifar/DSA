public class WordReverse {

    public static String reverseWord(String str){
        int i=0,l=0,j=str.length(),k=0;
        String s[] = new String[j];

        while (i<=j) {           

            if(i==j || str.charAt(i)==' ' ){
                s[l] = str.substring(k,i);
                while (i<j && str.charAt(i) == ' ') {
                    i++;
                }
                l++;
                k=i;
                
            }
            i++;
        }

        i=0;
        k=l-1;
        while (i<k) {
            String tmp = s[i];
            s[i] = s[k];
            s[k] = tmp;
            i++;
            k--;
        }
        
        i=0;
        str="";
        while (i<l) {
            str += s[i]+" ";
            i++;
            
        }
        str = str.strip();
        
        return str;
    }

    public static void main(String[] args) {
        String s= "the   sky    is blue";
        String word[] = s.split("\\s+"); // spliting by irregular spaces
        for(int i=0; i<word.length;i++){
            System.out.println(word[i]+" ");
        }
        System.out.println();
        System.out.println(reverseWord(s)+"#");
    }
    
}
