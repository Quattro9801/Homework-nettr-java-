package Chapter2Exercise5;

final class Point {
    private final double x;
    private final double y;
    private double newx;
    private double newy;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point()
    {
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Point translate(double deltax,double deltay)
    {
        newx=x+deltax;
        newy=y+deltay;
        return new Point(newx,newy);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point scale(double scale)
    {
       newx=x*scale;
       newy=y*scale;
        return new Point(newx,newy);
    }
    public Point calculateResult()
    {
        return new Point(3,4).translate(1,3).scale(0.5);
    }



}

