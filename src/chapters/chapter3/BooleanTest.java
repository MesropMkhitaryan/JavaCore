package chapters.chapter3;

public class BooleanTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        if (b) {
            System.out.println("this code will work");
        }
        b = false;
        if (b) {
            System.out.println("this code wont work");
        }

        System.out.println("10 > 9 is " + (10 > 9));
    }
}
