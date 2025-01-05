import java.util.Scanner;
// Объявляем тип сканнер
// Ввод данных
// тип имяПеременной = new тип(параметры)
// тип другаяПеременная = имяПеременной.метод
// Класс Scanner
// Scanner sc = new Scanner(System.in);
// String value = sc.nextLine();
// System.out.println(value);

public class MyScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // system.in -будем считывать данные с консоли
        String name = sc.nextLine(); // метод nextLine считает первую сточку с консоли и присвоит ее в name

        Person Person3 = new Person(name);
        Person3.printName();
    }
}
