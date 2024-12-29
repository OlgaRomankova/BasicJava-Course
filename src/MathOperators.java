public class MathOperators {
    public static void main(String[] args) {
        int a = 50;
        a = a + 1; // или
        a++; // увеличить на 1
        a--; // уменьшить  1
        a += 5; //  прибавить 5
        a -= 6; // отнять 6

        int b = 20;
        int c = a + b;
        int d = a % b;
        double e = (double) a / b;
        int f = a += 10;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a);
        System.out.println(f);
    }
}
