package Figures;

public class Circle {
    private double radius=1.0;
    private String color="red";
    private String color1;
    private double radius1;

    public Circle()
    {

    }

    public Circle(double radius, String color) {
        this.radius = radius;// ссылка на текущий объект
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {

         return  Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public Circle getCurrentObject()
    {
        return this;
    }
}
