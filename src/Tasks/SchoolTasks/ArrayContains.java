package Tasks.SchoolTasks;
import java.util.Scanner;
public class ArrayContains {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // Ввод первого массива
                System.out.print("Введите размер массива А: ");
                int n1 = sc.nextInt();
                int[] array1 = new int[n1];
                System.out.println("Введите элементы массива А:");
                for (int i = 0; i < n1; i++) {
                    array1[i] = sc.nextInt();
                }

                // Ввод второго массива
                System.out.print("Введите размер массива M: ");
                int n2 = sc.nextInt();
                int[] array2 = new int[n2];
                System.out.println("Введите элементы массива M:");
                for (int i = 0; i < n2; i++) {
                    array2[i] = sc.nextInt();
                }

                // Проверяем, входит ли второй массив в первый
                if (isSubset(array1, array2) && isSubset(array2, array1)) {
                    System.out.println("A = M - массивы равны"); // Массивы равны
                } else if (isSubset(array1, array2)) {
                    System.out.println("A ⸧ M - Массив M является подмножеством массива \n" +
                           "A, потому что все элементы массива M содержатся в массиве A ");
                } else if (isSubset(array2, array1)) {
                    System.out.println("A ⸦ M - Массив А является подмножеством массива \n" +
                            "M, потому что все элементы массива А содержатся в массиве М ");
                } else {
                    System.out.println("A⊈M - ни один элемент массива M не входит в состав массива А");
                }
            }

            // Метод для проверки, является ли второй массив подмножеством первого
            private static boolean isSubset(int[] array1, int[] array2) {
                for (int num : array2) {
                    boolean found = false;
                    for (int element : array1) {
                        if (num == element) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        return false; // Если хотя бы один элемент не найден, это не подмножество
                    }
                }
                return true; // Все элементы второго массива найдены в первом
            }
        }


