package ex_Task;

import java.util.Scanner;

public class Task015_Odd_Even_from_Array {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        int[] num = { 2,4,6,8,2,33,43,44,32,7,77,7};

        for (int i=0;i<=num.length-1;i++){
        if (num[i]%2==0) {
                System.out.println("Even :"+num[i] );
        }
        else
            {
                System.out.println("Odd :"+num[i] );

            }

        }
    }
}
