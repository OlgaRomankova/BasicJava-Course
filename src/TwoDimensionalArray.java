 // Двухмерный массив
 // тип [][] = new тип [размер строк][размер столбцов]
 // тип [][] = {
 // {var1,var2,var3},
 // {var1,var2,var3}
 // };


 public class TwoDimensionalArray {
     public static void main(String[] args) {
         int[][] a = new int[3][3];
         // Заполняем массив для примера
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {
                 a[i][j] = i + j; // Пример значения
             }
         }
         // Выводим массив
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a[i].length; j++) {
                 System.out.print(a[i][j] + " ");
             }
             System.out.println(); // Переход на новую строку после каждой строки массива
         }
     }
 }
