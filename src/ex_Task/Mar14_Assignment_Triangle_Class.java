package ex_Task;
import java.util.Scanner;

public class Mar14_Assignment_Triangle_Class {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //
        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.

/*
        int t1 = Integer.parseInt(args[0]);
        int t2 = Integer.parseInt(args[1]);
        int t3 = Integer.parseInt(args[2]);

        if(t1==t2 && t1==t3 && t2==t3)
        {
            System.out.println("Its a equilateral!!");
        }
        else if((t1==t2 || t1==t3) && (t1==t3 ||t2==t3)){
            System.out.println("Its a isosceles ");
        }
        else System.out.println("Its a scalene");

*/


      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sides of triangle : ");

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
            System.out.println("Invalid side..!!");
        }

        if(n1==n2 && n2==n3)
        {
            System.out.println("Its a equilateral!!");
        }
        else if(n1==n2 || n1==n3 || n1==n3 ){
            System.out.println("Its a isosceles ");
        }
        else{
            System.out.println("Its a scalene");
        }


    }


}

