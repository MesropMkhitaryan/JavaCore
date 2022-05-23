package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        int[] nums = {43, 55, 5, -9, 0, 12, 5, 65};

        System.out.println("example 1 ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                int q = nums[j];
                if (nums[j + 1] < nums[j]) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = q;
                }


            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println("example 2 ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                int q = nums[j + 1];
                if (nums[j + 1] > nums[j]) {
                    nums[j + 1] = nums[j];
                    nums[j] = q;
                }


            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


    }


}









