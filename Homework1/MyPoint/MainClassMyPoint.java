package MyPoint;

import java.util.Arrays;

public class MainClassMyPoint {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        int i;



    MyPoint point=new MyPoint(1,3,4,5);
        System.out.println(point);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.distance());


        point.setXY(2,6,8,9);//изменли значения
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.distance());

        MyPoint point1=new MyPoint();
        System.out.println(point1.distance());//distance from the point (0;0)

    }
}
