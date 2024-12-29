// Массив - структура данных хранящая элементы одного типа
// тип[] array = new тип[размер массива]
// тип[] array = {var1, var2, var3}
// массив int по умолчанию(по дефолту) инициализируется как 0
// массив String по умолчанию инициализируется как null

public class Arrays {
    public static void main(String[] args) {
     int[] array = new int[5]; // [0,0,0,0,0] если по умолчанию
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }
     String[] stringArray = {"one", "two", "three"}; // ["one", "two", "three"]
        System.out.println(stringArray[0]);
        stringArray[1] = "four";
        System.out.println(stringArray[1]);
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = i;
            System.out.println(stringArray[i]);
        }
    }

}
