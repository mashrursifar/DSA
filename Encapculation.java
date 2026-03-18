
/*  Encapsulation is defined as the wrapping up of data
 and method uder a signle unit. It also implements data hiding.*/ 


public class Encapculation {

    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.color = "red";
        System.out.println(p1.color);


        User u1 = new User();
        
        u1.setPassword("pass#321");

        System.out.println(u1.getPassword());
    }


}
class User{
    private String userName;
    private String password;
    public String name;

   String getUserName() {
        return userName;
    }
    void setUsername(String userName){
        this.userName = userName;
    }

    void setPassword(String password){
        this.password = password;
    }

    String getPassword(){
        return password;
    }
}


class Pen{
    String color;
    int tip;


}
