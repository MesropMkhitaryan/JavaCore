package chapters.chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "one";
        switch (str) {
            case "one":
                System.out.println(str);
                break;
            case "two":
                System.out.println(str);
                break;
            case "three":
                System.out.println(str);
                break;
            default:
                System.out.println("nothing");
                break;
        }

    }
}
