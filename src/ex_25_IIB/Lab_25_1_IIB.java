package ex_25_IIB;

public class Lab_25_1_IIB {

    public static void main(String[] args) {

        A a;
        new A();
        System.out.println("-------");
        A a1= new A();
    }
}


class A{

    A(){
        System.out.println("This is a default constrctor ");
    }
    {
        System.out.println("This is IIB-1 & called when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file

    }

    {
        System.out.println("This is IIB -2");

    }
    {

        System.out.println("This is IIB 3");
    }

}