package Recursion;


public class RemoveDuplicate {
    
    public static void rmDup(String str,StringBuilder newStr, boolean map[], int idx){

        
        if(idx == str.length()){
            System.out.println(newStr.toString());
            return;
        }
        char ch = str.charAt(idx);

        if(map[ch-'a']==false){

            map[ch-'a'] = true;
            newStr.append(ch);
            rmDup(str, newStr, map, idx+1);
            
            
        }else{

            rmDup(str, newStr, map, idx+1);
        }

    }
    public static void main(String[] args) {

        boolean arr[] = new boolean[26];

        rmDup("apnacollegex", new StringBuilder(""), arr,0);
        
    }
}
