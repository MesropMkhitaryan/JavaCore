package chapters.chapter4;

public class ByteShift {
    public static void main(String[] args) {
        byte a = 60, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("value of a before = " + a);
        System.out.println("i and b = " + i + " " + b);
    }
}
