package exercise4Chapter4;

public class Line extends Shape implements Cloneable
{
    Point from;
    Point to;

    public Line(Point from, Point to) {
        super(null);
        this.from = from;
        this.to = to;
        this.point = new Point(
                (from.getX() + to.getX()) / 2,
                (from.getY() + to.getY()) / 2
        );
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    public void setFrom(Point from) {
        this.from = from;
    }

    public void setTo(Point to) {
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return point;
    }
    @Override
    protected Line clone() {
        try {
            Line cloned = (Line) super.clone();
            cloned.point = new Point(point.getX(), point.getY());
            cloned.from = new Point(from.getX(), from.getY());
            cloned.to = new Point(to.getX(), to.getY());
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
