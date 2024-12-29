public class SwitchCase {
    public static void main(String[] args) {
        int a = 3;
        switch (a) {
                case 1:  // Указываем значение для сравнения
                    System.out.println("1");
                    break; // если истина, то брейк
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;

            default:
                System.out.println(100);
        }
    }
}


