package chapters.chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //light speed aproximately
        lightspeed = 186000;

        //in how many days
        days = 1000;
        //days in seconds
        seconds = days * 24 * 60 * 60;
        //distance
        distance = lightspeed * seconds;

        System.out.print("in " + days);
        System.out.print(" days light will pass around ");
        System.out.println(distance + " kilometers");






    }
}
