package ex_Task;

// Take a user input - Name, Age and Salary and print them in the end.

import java.util.Scanner;

public class Task007_CliOptions {
    public static void main(String[] args) {

        String name1 = args[0];
        Integer age1 = Integer.parseInt(args[1]);
        Double sal1 = Double.parseDouble(args[2]);


        System.out.println("Name : "+name1+"\n"+"Age :"+age1+"\n"+"Salary :"+sal1);


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
