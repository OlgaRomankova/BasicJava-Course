// Почти все в языке это объекты, кроме примитивов
// Объект - это набор свойств "свойство":"значение"

public class Person {
   private String name;
    public static int newCount = 1;

    public Person(String name) {
        this.name = name;
        newCount++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void printNameAndSecondName(String name, String secondName) {
    System.out.println("First name: " + name);
    System.out.println("Second name: " + secondName);
    }

    public  void printName() {
        System.out.println("Name: " + name);
}
    // Создадим еще один метод самостоятельно
    public  void myMethod(String firstName, Integer age, String adress) {
        System.out.println("First name: " + firstName + ", Age: " + age + ", Adress: " + adress);
    }
}
