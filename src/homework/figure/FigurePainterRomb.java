package homework.figure;

public class FigurePainterRomb {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        int b= 0;
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = 4; j > b  ; j--) {
                System.out.print("* ");
            }
            b++;
            System.out.println();


        }
    }
}
