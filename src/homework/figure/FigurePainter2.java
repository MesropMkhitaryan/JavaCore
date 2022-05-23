package homework.figure;

public class FigurePainter2 {
    public static void main(String[] args) {
        int q = 5;
        for (int i = 0; i <=5 ; i++) {
            for (int j = 0; j <= q; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            q--;
            System.out.println();

        }
    }
}
