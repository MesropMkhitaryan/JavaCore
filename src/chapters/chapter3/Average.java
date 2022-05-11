package chapters.chapter3;

public class Average {
    public static void main(String[] args) {
        double[] nums = {11.5, 14.6, 10.1, 24.5};
        double result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
            System.out.println("average is equal to " + result / nums.length);


        }
    }
}
