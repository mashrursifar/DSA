public class sortest {
    public static void path(String str){
        int x=0, y=0;
        for(int i=0; i<str.length();i++){

            

            if(str.charAt(i)=='S'){
                y--;
            }else if(str.charAt(i)=='N'){
                y++;
            }else if(str.charAt(i)=='E')
            {
                x++;
            }else{
                x--;
            }

           
        }
        x = x*x;
        y = y*y;
        System.out.println("Shortest path: " + Math.sqrt(x+y));


    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        path(str);
    }
}
