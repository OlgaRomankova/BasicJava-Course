package Tasks;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Enter 1: $");
        System.out.println("Enter 2: €");
        System.out.println("Enter 3: ₽");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose options number: ");
        int a = sc.nextInt();
        System.out.println("Enter the amount to be converted: ");
        int b = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println(b + " dollars" + " = " + (0.97075 * b) + " €");
                System.out.println("Conversion rate is  1 $ = 0.97075 €");
                System.out.println(b + " dollars" + " = " + (95.2501 * b) + " rub");
                System.out.println("Conversation rate is 1 $ = 95.2501 rub");
                break;
                case 2:
                    System.out.println(b + " euro" + " = " + (1.02 * b) + " dollars");
                    System.out.println("Conversion rate is  1 € = 1.02 $");
                    System.out.println(b + " euro" + " = " + (109.8235 * b) + " rub");
                    System.out.println("Conversion rate is 1 € = 109.8235 rub");
                    break;
                    case 3:
                        System.out.println(b + " rub" + " = " + (0.0095 * b) + " euro");
                        System.out.println("Conversion rate is  1 rub = 0.0095 €");
                        System.out.println(b + " rub" + " = " + (0.0098 * b) + " $");
                        System.out.println("Conversion rate is  1 rub = 0.0098 €");
                        break;

                        default:
                            System.out.println("Invalid option");
        }
    }
}
