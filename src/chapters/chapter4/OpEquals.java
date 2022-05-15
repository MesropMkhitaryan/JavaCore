package chapters.chapter4;

public class OpEquals {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int c = 10;
        a += 3;
        b *= 4;
        c += a * b;
        c %= 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
