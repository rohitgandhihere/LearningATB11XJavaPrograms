package ex_30_Generics;

public class Lab_30_2_Genrerics_Basics {
    public static void main(String[] args) {
        add1(5,5);
        add1("Rohit", "Gandhi");
    }
        static <T>T add1(T a,T b){

            System.out.println(a);
            System.out.println(b);
        return null;
        }


}

