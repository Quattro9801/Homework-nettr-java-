package exercise4Chapter4;
public class Circle extends Shape implements Cloneable {
    private double radius;
    private double newX;
    private double newY;
    public Circle(Point point, double radius) {
        super(point);
        this.radius=radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + point +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return this.point;
    }
    @Override
    protected Circle clone() {
        try {
            Circle cloned = (Circle) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public double getRadius() {
        return radius;
    }

}

