package chapters.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;

        if (x < y) {
            System.out.println("x is smaller than y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("now x is equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("now x is bigger than y");
        }
        //this operator wont be used
        if (x == y) {
            System.out.println("now x is equal to y");
        }

    }
}
