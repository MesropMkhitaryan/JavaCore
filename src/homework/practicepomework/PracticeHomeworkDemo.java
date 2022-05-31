package homework.practicepomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework a = new PracticeHomework();

        double conv;
        conv = a.convert(5);
        System.out.println(conv);

        int dayyear;
        dayyear = a.calcAge(5);
        System.out.println(dayyear);

        int nextnum;
        nextnum = a.nextNumber(7);
        System.out.println(nextnum);

        boolean equal;
        equal = a.isSameNum(7,9);
        System.out.println(equal);

        boolean lessthanzero;
        lessthanzero = a.lessThanOrEqualToZero(-5);
        System.out.println(lessthanzero);

        System.out.println(a.reverseBool(true));

        System.out.println(a.maxLength(new int[12],new int[13]));



    }

}
