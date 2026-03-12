public class subString {
    
    public static String substring(String str,int si,int ei ){
        String subString = "";

        for(int i = si; i<ei; i++){
            subString += str.charAt(i);
        }

        return subString;
    }
    public static void main(String[] args) {
        String str = "MashrurSifar";
        System.out.println(substring(str, 2,6));

        // Built in method for substring
        System.out.println(str.substring(2,6));
    }
}
