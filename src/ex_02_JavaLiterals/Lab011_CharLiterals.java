package ex_02_JavaLiterals;

public class Lab011_CharLiterals {

    public static void main(String[] args) {

        char a='1';
        char a1='A';
        char a2='B';
        char a3='P';
        char a4='W';
        char a5='(';
        char a6='@';
        char a7=' ';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("RohitGandhi");
        System.out.println("Rohit"+new_line+"Gandhi");
        System.out.println("Rohit"+tab_line+"Gandhi");
        System.out.println("Rohit"+back_space+"Gandhi");
        System.out.println("Rohit is old"+carriage_return+"Gandhi");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';

    }
}
