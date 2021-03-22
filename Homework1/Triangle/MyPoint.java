package Triangle;
public class MyPoint {
    private double x;
    private double y;

   @Override
    public String toString() {
       return " (" +
               "x=" + x +
               ", y=" + y +
               ')';

   }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public double getY() {
        return y;
    }

    public double MyPointDistance(double x,double y)
    {

        double EdgeX = this.x - x;
        double EdgeY = this.y - y;
        return Math.sqrt(EdgeX*EdgeX + EdgeY*EdgeY);

    }

    public double MyPointdistance(MyPoint myPoint) {
        double EdgeX = this.x - myPoint.getX();
        double EdgeY = this.y - myPoint.getY();
        return Math.sqrt(EdgeX*EdgeX + EdgeY*EdgeY);
    }
}
