package homework;

public class FigurePainter2 {
    public static void main(String[] args) {

        int b = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 7; j > b; j--) {
                System.out.print(" ");
            }

            for (int j = 3; j >= i; j--) {
                System.out.print("*");

            }
            b--;
            System.out.println();
        }

    }
}
