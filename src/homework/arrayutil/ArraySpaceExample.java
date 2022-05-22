package homework.arrayutil;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        int counter = 0;
        int counter1 = 0;


        for (int i = spaceArray.length-1;  i>0; i--) {
            if (spaceArray[i] != ' ') {
                counter =  i;
                break;
            }

        }


        for (int i = 0;  i<spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                counter1=  i;
                break;
            }

        }
        for (int i = counter1; i <= counter; i++) {
            System.out.print(spaceArray[i]);


        }





    }
}
