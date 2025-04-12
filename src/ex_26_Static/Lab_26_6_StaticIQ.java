package ex_26_Static;

public class Lab_26_6_StaticIQ {

    public static void main(String[] args) {

        Automation a1 = new Automation();

        System.out.println(Automation.driver);
        System.out.println(a1.driver);

        Automation t2 = new Automation();
        Automation t3 = new Automation();

        System.out.println(t2.driver);
        System.out.println(t3.driver);



    }
}

class Automation{

    static String driver ="chrome";

}