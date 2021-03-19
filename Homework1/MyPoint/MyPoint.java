package MyPoint;

import java.util.Arrays;

public class MyPoint {
    private int x=0;
    private int y=0;
    private int x2=0;
    private int y2=0;
    int[] array=new int[4];
    public MyPoint()
    {

    }

    public MyPoint(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int[] getXY()
    {
        for (int i=0;i< array.length;i++)
        {
            array[0]=x;
            array[1]=y;
            array[2]=x2;
            array[3]=y2;

        }
      return (array);

    }
    public void setXY(int x, int y, int x2, int y2)
    {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    public double distance(int x, int y, int x2, int y2)
    {
        double a=Math.pow((x2-x),2);
        double b=Math.pow((y2-y),2);
        return  Math.sqrt(a+b);
    }
    public double distance()
    {
        double a=Math.pow((x2-x),2);
        double b=Math.pow((y2-y),2);
        return  Math.sqrt(a+b);
    }

}
