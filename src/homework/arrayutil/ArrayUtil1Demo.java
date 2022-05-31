package homework.arrayutil;

public class ArrayUtil1Demo {
    public static void main(String[] args) {
        ArrayUtil1 arr = new ArrayUtil1();
        int[] numbers = {2,4,6,1,9,6};
        System.out.println("max = " + arr.max(numbers));
        System.out.println("min = " + arr.min(numbers));
        arr.even(numbers);
        System.out.println();
        arr.odd(numbers);
        System.out.println();
        System.out.println("number of even nums = " + arr.evenNum(numbers));
        System.out.println("number of odd nums = " + arr.oddNum(numbers));
        System.out.println("sum of array = " + arr.sum(numbers));
        System.out.println("average = " + arr.avg(numbers));



    }
}
