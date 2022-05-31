package homework.arrayutil;

public class ArrayUtil1 {
    int max(int[] array) {
        int biggest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (biggest < array[i]) {
                biggest = array[i];
            }
        }
        return biggest;
    }
    int min(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    void even(int[] array){
        int ev = 0;
        System.out.print("even numbers =  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
    }
    void odd(int[] array){
        System.out.print("odd numbers =  ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }

        }
    }
    int evenNum(int[] array){
        int countOfEvenNums = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countOfEvenNums++;
            }
        }
        return countOfEvenNums;
    }
    int oddNum(int[] array){

        int countOfOddNums = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOfOddNums++;
            }

        }
        return countOfOddNums;
    }
    int sum(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        return sum;
    }
    int avg(int[] array){
        int sum = 0;
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

            average = sum / array.length;
        }
        return average;
    }
}
