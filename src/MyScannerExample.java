import java.util.Scanner;

public class MyScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Person Person2 = new Person(name);
        Person2.printName();
    }
}
