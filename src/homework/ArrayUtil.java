package homework;

public class ArrayUtil<average> {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        // print arrays allelements
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //biggest number
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
        }
        System.out.println(biggest);
        // smallest number
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        System.out.println(smallest);
        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
////Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }

        }
        //Տպեք զույգերի քանակը։
        int zuyg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                zuyg++;
            }
        }
        System.out.println(zuyg);
        //Տպեք կենտերի քանակը
        int kent = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                kent++;
            }

        }
        System.out.println(kent);
        // Տպեք մասիվի էլեմենտների գումարը։ և մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

            average = sum / array.length;
        }
        System.out.println(sum);
        System.out.println(average);

    }


}


