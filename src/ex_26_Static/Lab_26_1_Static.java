package ex_26_Static;

public class Lab_26_1_Static {
    public static void main(String[] args) {

        StaticBlock sb = new StaticBlock();
        System.out.println("---------");
        StaticBlock sb1 = new StaticBlock();
        System.out.println("---------");
        new StaticBlock();

    }}
class StaticBlock{

    static {
        System.out.println("This is staticBlock");
    }

    public StaticBlock(){
        System.out.println("This is constructor");
    }

    {
        System.out.println("This is IIB");
    }



    }

