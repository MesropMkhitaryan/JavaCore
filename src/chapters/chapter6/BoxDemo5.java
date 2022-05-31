package chapters.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox = new Box(10,40,15);
        Box mybox1 = new Box(5,4,8);
        double vol;

        vol = mybox.Volume1();
        System.out.println(vol);
        vol = mybox1.Volume1();
        System.out.println(vol);
    }
}
