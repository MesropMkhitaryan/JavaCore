package chapters.chapter6;

public class Box {
    double width;
    double heigth;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    void Volume() {
        System.out.println(depth * heigth * width);
    }

    double Volume1() {
        return depth * heigth * width;
    }

    void SetDim(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

}

