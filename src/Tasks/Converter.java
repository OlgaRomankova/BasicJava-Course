package Tasks;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        System.out.println("Hello!");
        System.out.println("Enter 1: USD");
        System.out.println("Enter 2: EUR");
        System.out.println("Enter 3: RUB");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nChoose options number: ");
        int a = sc.nextInt();
        System.out.println("Your choice is: " + a);
        System.out.println("\nEnter the amount to be converted: ");
        int b = sc.nextInt();
        System.out.println("\nYour amount to be converted: " + b);

        switch (a) {
            case 1:
                System.out.println("\n");
                System.out.println(b + " USD" + " = " + (0.97075 * b) + " EUR");
                System.out.println("Conversion rate is  1 USD = 0.97075 EUR");
                System.out.println(b + " USD" + " = " + (95.2501 * b) + " RUB");
                System.out.println("Conversation rate is 1 USD = 95.2501 RUB");
                break;
                case 2:
                    System.out.println(b + " EUR" + " = " + (1.02 * b) + " USD");
                    System.out.println("Conversion rate is  1 EUR = 1.02 USD");
                    System.out.println(b + " EUR" + " = " + (109.8235 * b) + " RUB");
                    System.out.println("Conversion rate is 1 EUR = 109.8235 RUB");
                    break;
                    case 3:
                        System.out.println(b + " RUB" + " = " + (0.0095 * b) + " EUR");
                        System.out.println("Conversion rate is  1 RUB = 0.0095 EUR");
                        System.out.println(b + " RUB" + " = " + (0.0098 * b) + " USD");
                        System.out.println("Conversion rate is  1 RUB = 0.0098 EUR");
                        break;

                        default:
                            System.out.println("Invalid option");
        }
    }
}
/*
The "Currency Converter" project allows the user to convert currency from one unit to another.
Java knowledge used: data types and variables, working with the Scanner class,
methods nextInt(), System.out.println(), conditional constructs (switch and case),
simple arithmetic operations, error handling (if the user selects an invalid option,
the program displays an error message).
 */