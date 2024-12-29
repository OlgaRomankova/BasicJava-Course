public class ContinueBreakOperators {
    public static void main(String[] args) {
        for (int x = 1; x < 20; x++) {
            if (x % 2 == 0) continue;   // пропустить четные числа (continue означает переход на следующую итерацию
                                        // если значение истина, то плюс 1, ложь -переход на цикл ниже
                                        //  1 не делится без остатка -ложь, 1 не больше 7 -ложь, вывести на печать 1 и плюс 1
                                        // 2 делится без остатка, переход к 3
            if (x > 7) break; // остановить цикл если число больше, чем 7

            System.out.println(x);
        }
    }
}



