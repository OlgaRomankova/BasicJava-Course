// Without cycles
//        int a = 0;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        a++;
//        System.out.println(a);
//        a++;
//        Cycle FOR
//        for (int i = 0; i < 10; i++) {
//            Повторяющиеся операции которые будут выполняться столько раз,
//            пока i не перестанет удовлетворять условию <10
//              }

public class CycleFOR {
    public static void main(String[] args) {
       int a = 0;
        for (int i = 0; i < 5; i++) {     // можно написать i = i + 2, тогда будет прибавлять 2 (0 2 4)и др.
       System.out.println(a);
       a++;


   }
    }
}
