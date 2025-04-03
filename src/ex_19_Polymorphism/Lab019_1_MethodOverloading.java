package ex_19_Polymorphism;

public class Lab019_1_MethodOverloading {

    public static void main(String[] args) {

        Calculator cal=new Calculator();
        cal.sum(5,5);
        int sum = cal.sum(5,5,5);
        System.out.println("Sum :"+sum );

    }

}

class Calculator{

    void sum(int a, int b){

        System.out.println("Sum :"+(a+b));

    }

    int sum(int a,int b,int c){
        return a+b+c;
    }



}