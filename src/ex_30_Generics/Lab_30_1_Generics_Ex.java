package ex_30_Generics;

public class Lab_30_1_Generics_Ex {
    public static void main(String[] args) {

        add(10, 20);
        add(20.5, 100.5);
        add("Rohit","Gandhi");

    }
        static int add(int a,int b){
        return a+b;
        }

        static double add(double d1, double d2){
        return d2+d2;
        }

        static String add(String s1,String s2){
        return s1+s2;

        }
}

