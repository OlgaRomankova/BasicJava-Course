package Tasks.SchoolTasks;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        // Вызов метода для создания номера телефона
        String phoneNumber = createPhoneNumber(number);

        // Вывод результата
        System.out.println(phoneNumber);
    }

    // Метод для создания номера телефона в нужном формате
    public static String createPhoneNumber(int[] number) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                number[0], number[1], number[2],
                number[3], number[4], number[5],
                number[6], number[7], number[8], number[9]);
    }
}