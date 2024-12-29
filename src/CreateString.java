public class CreateString {
    public static void main(String[] args) {
        String name = "Andrei";
        String name1 = "Andrei";
        String name2 = new String("Andrei");
        String welcome = "Hello World";
        System.out.println(name == name1); // ссылка ведет в одно и то же место, сравнили true
        System.out.println(name == name2); // ссылочный тип данных, ссылка ведет в разные места,
                                           // так как создана явно новая переменная new String, false
        System.out.println(welcome);
    }


}
