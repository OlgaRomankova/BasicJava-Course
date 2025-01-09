package Tasks;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // сканируем данные с консоль
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat(); // ждем, пока юзер введет число
        System.out.println("Choose operation +, -, *, /: ");
        char op = sc.next().charAt(0); // сканируем только первый символ
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();

        if (op == '+') {
            System.out.println("Sum of numbers " + a + " and " + b + " is equal to... ");
            System.out.println(a + " + " + b + " = " +(a + b));
            System.out.println("Result: " + (a + b));
        }
        else if (op == '-') {
            System.out.println("The difference between the numbers " + a + " and " + b + " is equal to... ");
            System.out.println(a + " - " + b + " = " +(a - b));
            System.out.println("Result: " + (a - b));
        }
        else if (op == '*') {
            System.out.println("The product of the numbers " + a + " and " + b + " is equal to... ");
            System.out.println(a + " * " + b + " = " +(a * b));
            System.out.println("Result: " + (a * b));
        }
        else if (op == '/') {
            System.out.println("The quotient of numbers " + a + " and " + b + " is equal to... ");
            System.out.println(a + " / " + b + " = " +(a / b));
            System.out.println("Result: " + (a / b));
        }
        else {
            System.out.println("Invalid operation");
        }

    }
}
/* This project used basic concepts in Java: variables and data types,
mathematical operators, console output, data input through a condition,
If ... Else cycle, string concatenation
 */
