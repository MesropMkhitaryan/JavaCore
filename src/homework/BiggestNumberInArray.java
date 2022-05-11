package homework;

public class BiggestNumberInArray {
    public static void main(String[] args) {
        int large, second;
        int[] array = {3, 4, 34, 54, 66, 23, 1};
        large = array[0];
        second = array[1];
        for (int i = 0; i < array.length; i++) {
            if (large < array[i]) {
                large = array[i];
            }
            if (large > second || second > array[i]) {
                second = array[i];
            }
        }
        System.out.println(large);
        System.out.println(second);
    }
}
