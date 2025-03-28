package practice;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String input =scanner.next();

        System.out.println("GivenString -"+input);

        String rev="";
        int len=input.length();

        for(int i=len;i>0;i--){

            rev=rev+input.charAt(i);

        }

        System.out.println("Reverse - "+rev);

    }
}
