// Почти все в языке это объекты, кроме примитивов
// Объект - это набор свойств "свойство":"значение"

public class Person {
   private String name;


    public Person(String name) {
        this.name = name;
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

}
