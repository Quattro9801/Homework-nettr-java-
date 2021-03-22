package Triangle;
import java.util.ArrayList;
import java.util.List;

public class Triangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
;

    enum Type {

        Equilateral,
        Isosceles,
        Scalene,
        DoesNotExist;
    }

    Type T;
    private int x1;
    private int y1;

    private int x2;
    private int y2;
    private int x3;
    private int y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle(" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ')';
    }



    public double getPerimetr() {

        return v1.MyPointdistance(v2) + v1.MyPointdistance(v3) + v2.MyPointdistance(v3);
    }

    public String getType() {

        double firstEdge = v1.MyPointdistance(v2);
        double secondEdge = v1.MyPointdistance(v3);
        double thirdEdge = v2.MyPointdistance(v3);

        if ((firstEdge + secondEdge) > thirdEdge & ((firstEdge + thirdEdge) > secondEdge & ((thirdEdge + secondEdge) > firstEdge))) {

            if (firstEdge == thirdEdge && thirdEdge == secondEdge) {

                T = Type.Equilateral;//равносторонний
                return String.valueOf(T);
            } else if (firstEdge == secondEdge || firstEdge == thirdEdge || secondEdge == thirdEdge) {

                T = Type.Isosceles;// равнобедренный
                return String.valueOf(T);
            } else if (firstEdge != secondEdge && firstEdge != thirdEdge && secondEdge != thirdEdge) {

                T = Type.Scalene;//разносторонний
                return String.valueOf(T);
            }
        }
        return String.valueOf(T.DoesNotExist);


    }
}
