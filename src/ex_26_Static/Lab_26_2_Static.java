package ex_26_Static;

public class Lab_26_2_Static {
    public static void main(String[] args) {

        B a = new B(20);
        a.displayInfo();

        System.out.println(B.b);
        B.b=200;
        System.out.println("----");
        B a2=new B(300);
        a2.displayInfo();

        System.out.println(B.b);

    }
}

class B{

    int a = 10;
    static int b = 100;

   B(int a){
       this.a=a;
   }

   void  displayInfo()
   {
       System.out.println(this.a);
   }
}