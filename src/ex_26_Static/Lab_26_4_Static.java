package ex_26_Static;

public class Lab_26_4_Static {
    public static void main(String[] args) {

        C.commonToAll();
        System.out.println(C.b);

        C c =new C();
        c.display();
        System.out.println(C.b);
        System.out.println(c.a);
    }
}

class C{

       int a =20;
       static int b=50;
    static {
        System.out.println("Call once class is loaded");
    }

    void display(){
        System.out.println(b);
        System.out.println("Non Static function");
    }

    static void commonToAll(){
        //System.out.println(a);  // Not allowed
        System.out.println("Static function");
    }

}