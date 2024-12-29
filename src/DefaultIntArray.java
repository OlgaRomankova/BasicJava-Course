
public class DefaultIntArray {
    public static void main(String[] args) {
        int[][] intArray = new int[10][10]; // По умолчанию элементы равны 0
        // Вывод двумерного массива
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = i;
                System.out.print(intArray[i][j] + " "); // 0 будет выведено по умолчанию
            }
            System.out.println(); // используется для перехода на новую строку после
                                  // вывода каждого ряда (строки) двумерного массива.
        }
    }
}
