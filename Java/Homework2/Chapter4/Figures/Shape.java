package exercise4Chapter4;

public abstract class Shape {

    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

        public void moveBy(double dx, double dy) {
           double newX = point.getX() + dx;
            double newY = point.getY() + dy;
            point = new Point(newX, newY);
        }


    public abstract Point getCenter();


    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}
