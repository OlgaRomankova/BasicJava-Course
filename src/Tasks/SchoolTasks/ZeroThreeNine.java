package Tasks.SchoolTasks;

import java.util.Scanner;

public class ZeroThreeNine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first unique digit (0 to 9):");
        int a = sc.nextInt();

        System.out.println("Please enter the second unique digit (0 to 9):");
        int b = sc.nextInt();

        System.out.println("Please enter the third unique digit (0 to 9):");
        int c = sc.nextInt();

        int[] digits = {a, b, c};

        System.out.println("Three-digit numbers where each digit is used once:");
        for (int i = 100; i <= 999; i++) {
            int hundreds = i / 100; // сотни
            int tens = (i / 10) % 10;  // десятки
            int ones = i % 10;  // единицы

            // Проверяем, что цифры входят в разрешённый список и не повторяются
            if (isAllowed(digits, tens) && isAllowed(digits, ones) && isAllowed(digits, hundreds) && tens != ones
            && tens != hundreds && hundreds != ones) {
                System.out.println(i);
            }
        }
    }

    private static boolean isAllowed(int[] digits, int digit) {
        for (int d : digits) {
            if (d == digit) {
                return true;
            }
        }
        return false;
    }
}
/*

For the implementation of the project "Generation of Three-Digit Numbers with Unique Digits," the following Java knowledge was applied:
Integer data types and arrays.
Working with the Scanner class.
Arithmetic operations (extracting digits from numbers).
Conditional constructs: if statements, the isAllowed method, and the logical operator &&.
Loops: for and for-each.
Working with the library: importing standard classes (e.g., java.util.Scanner) for handling user input.
Encapsulation of logic: moving checks into a separate method to make the code more readable and maintainable for this project.
 */