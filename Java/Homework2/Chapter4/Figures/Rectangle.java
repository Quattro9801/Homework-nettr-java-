package exercise4Chapter4;

class Rectangle extends Shape implements Cloneable {
    private double height;
    private double width;

    public Rectangle(Point topLeft,double height,double width) {
        super(topLeft);
        this.height=height;
        this.width=width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + point +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
    @Override
    protected Rectangle clone() {
        try {
            Rectangle cloned = (Rectangle) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }



    public Point getTopLeft() {
        return point;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public Point getCenter()
    {
        return new Point((point.getX() + width) / 2, (point.getY() + height) / 2);
    }
}
