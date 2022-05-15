package chapters.chapter4;

public class IncDec {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c, d;

        c = a++;
        d = ++a;
        c++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
