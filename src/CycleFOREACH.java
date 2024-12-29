// for (тип переменная : array) {
// Повторяющиеся операции, которые будут выполняться столько раз, пока есть
// значение внутри массива array
// }


public class CycleFOREACH {
    public static void main(String[] args) {
        int[] array = new int[10];
        String[] stringArray = new String[5];
        for (int number: array) {
            System.out.println(number);
        }

        for (String str: stringArray) {
            System.out.println(str);
        }
    }
}
