
public class Main {
    public static void main(String[] args) {

        Person person2 = new Person("John");  // Указываем имя при создании объекта
//        System.out.println(person2.getName());
//        person2.setName("Alex");
//        System.out.println(person2.getName());
//        person2.printNameAndSecondName( "Ivan", "Ivanov");
//        //вызываем метод, который создан самостоятельно
//        person2.myMethod("Anna", 32, "pr.Mira, 12");

        Person person3 = new Person("Evgenii");
        Person person4 = new Person("John");
        System.out.println(Person.newCount);

    }
}

