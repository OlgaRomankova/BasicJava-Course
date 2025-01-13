package Tasks.SchoolTasks;

import java.util.Scanner;

public class TaskFortySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start of the range:");
        int start = sc.nextInt();
        System.out.println("Enter the end of the range:");
        int end = sc.nextInt();

        System.out.println("The set of numbers multiples of 3:");
        for (int i = start; i <= end; i++) {

            // Проверяем, что цифры входят в разрешённый список
            if (i % 3 == 0)  {
                System.out.println(i);
            }
        }
    }
    }
