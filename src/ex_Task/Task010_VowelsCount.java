package ex_Task;

import java.util.Scanner;

public class Task010_VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count = 0, consonantCount = 0;
        for (int i = 0; i <= input.length() - 1; i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            } else {
                consonantCount++;
            }

        }
        System.out.println("Vowels count :" + count);

        System.out.println("Consonant Count:" + consonantCount);
    }
}