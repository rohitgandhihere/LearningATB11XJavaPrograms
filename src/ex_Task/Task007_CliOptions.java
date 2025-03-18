package ex_Task;

// Take a user input - Name, Age and Salary and print them in the end.

import java.util.Scanner;

public class Task007_CliOptions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = sc.next();
        System.out.println("Enter age :");
        Integer age = sc.nextInt();
        System.out.println("Enter Salary :");
        Integer sal =sc.nextInt();

            System.out.println("Name : "+name+"\n"+"Age :"+age+"\n"+"Salary :"+sal);

    }



}
