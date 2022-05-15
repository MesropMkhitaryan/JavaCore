package homework;

public class ArrayUtil<average> {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        // print arrays allelements
        System.out.print("all elements of array ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //biggest number
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
        }
        System.out.println("biggest number = " + biggest);
        // smallest number
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println("smallest number = " + smallest);
        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        System.out.print("print even numbers ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i]+" ");
            }

        }
        System.out.println();
////Տպեք մասիվի բոլոր կենտ էլեմենտները։
        System.out.print("print odd numbers ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i]+" ");
            }

        }
        System.out.println();
        //Տպեք զույգերի քանակը։
        int countOfEvenNums = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNums++;
            }
        }
        System.out.println("quantity of even numbers = "+ countOfEvenNums);
        //Տպեք կենտերի քանակը
        int countOfOddNums = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOddNums++;
            }

        }
        System.out.println("quantity of odd numbers = " + countOfOddNums);
        // Տպեք մասիվի էլեմենտների գումարը։ և մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

            average = sum / array.length;
        }
        System.out.println("sum of array = " + sum);
        System.out.println("average number of array = " + average);

    }


}


