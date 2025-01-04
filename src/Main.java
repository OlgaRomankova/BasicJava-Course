
public class Main {
    public static void main(String[] args) {

        Person person2 = new Person("John");  // Указываем имя при создании объекта
        System.out.println(person2.getName());
        person2.setName("Alex");
        System.out.println(person2.getName());


        person2.printNameAndSecondName( "Ivan", "Ivanov");
    }
}
