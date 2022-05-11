package chapters.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 200;
        double d = 232.5;

        System.out.println("conversion of type int into type byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("conversion of type double into type int");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);
        System.out.println("conversion of type double into type byte");
        b = (byte) d;
        System.out.println("d and i " + d + " " + b);

    }
}
