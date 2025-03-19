package ex_08_Switch;
import java.util.Scanner;

public class Lab030_Without_Break {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        switch (day){

            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid, day number");
                break;


        }


    }
}
