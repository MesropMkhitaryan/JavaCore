package homework;

public class CharArrayExample {
    public static void main(String[] args) {
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        System.out.println("example 1");
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int cCounter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                cCounter++;

            }
        }
        System.out.println("quantity of c =  " + cCounter);
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        System.out.println("example 2");
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};



        System.out.println("ellement in the middle is " + chars2[chars2.length/2]);

        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        System.out.println("example 3");
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        char a = 'l';
        char b = 'y';


        if (chars3[chars3.length - 2] == a && chars3[chars3.length - 1] == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
// Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        System.out.println("example 4");
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};
        char q = 'b';

        for (int i = 0; i < bobArray.length; i++) {
            if (bobArray[i] == q && bobArray[i + 2] == q) {
                System.out.print(true + " ");
            } else {
                System.out.print(false + " ");
            }

        }
        System.out.println();

        System.out.println("example 5");
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        char probel =' ';
        for (int i = 0; i < text.length; i++) {
            if (text[i]!=probel){
                System.out.print(text[i]);
            }

        }


    }

}




