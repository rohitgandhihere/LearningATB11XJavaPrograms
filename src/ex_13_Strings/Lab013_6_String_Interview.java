package ex_13_Strings;

public class Lab013_6_String_Interview {
    public static void main(String[] args) {

        String s1="Hello";
        String s4="Hello";

        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");
        System.out.println(s1 == s3); //False
        System.out.println(s1 == s2); //False
        System.out.println(s2 == s3); //False

        System.out.println(s1 == s4); //True
        System.out.println(s3 == s5); //False

        // equals ( content) -> value

        System.out.println(s1.equals(s2)); //True
        System.out.println(s1.equals(s3)); //True
        System.out.println(s3.equals(s5)); // false
        System.out.println(s3.equalsIgnoreCase(s5)); //true

    }
}
