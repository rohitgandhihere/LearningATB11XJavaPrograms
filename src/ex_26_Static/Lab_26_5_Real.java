package ex_26_Static;

public class Lab_26_5_Real {

    public static void main(String[] args) {

        System.out.println(ATB11x.courseName);
        System.out.println(ATB11x.mentorName);
        ATB11x.doAssignemnts();
        ATB11x.joinViaZoomLink();

        ATB11x a = new ATB11x();
        a.setName("Rohit");
        a.setEmail("rohit@gmail.com");
        a.setPhone("1244545657");

        System.out.println();

    }

}
class ATB11x{

    String name;
    String phone;
    String email;

    static String courseName="ATB11x";
    static String mentorName="Pramod";

    static void doAssignemnts(){
        System.out.println("Please do the assignments...");
    }
    static  void joinViaZoomLink(){
        System.out.println("Please join via Zoom...");
    }

    public void howTheAssignments(){
        System.out.println("It is different");
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}