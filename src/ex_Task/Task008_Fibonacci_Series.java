package ex_Task;

import java.util.Scanner;

public class Task008_Fibonacci_Series
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();

        int f1=0, f2=1, sum=0;

        for(int i=0;i<=num;i++){

            sum=f1+f2;

            System.out.println("Fibonacci series :" +f1);

            f1=f2;
            f2=sum;


        }

    }


}
