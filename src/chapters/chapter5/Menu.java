package chapters.chapter5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println("java operators");
            System.out.println("1 if");
            System.out.println("2 switch");
            System.out.println("3 while");
            System.out.println("4 do while");
            System.out.println("5 for\n");
            System.out.println("choose operators");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice>'5');
        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("if operator");
                break;case '2':
                System.out.println("switch operator");
                break;case '3':
                System.out.println("while operator");
                break;case '4':
                System.out.println("do-while operator");
                break; case '5':
                System.out.println("for operator");
                break;



        }    }
}
