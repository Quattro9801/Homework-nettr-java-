package Figures;

public class MainClass {

    public static void main(String[] args) {
       Circle circle=new Circle(5,"red");
        System.out.println(circle.getArea());
       Circle circle1=new Circle();
        System.out.println(circle1.getArea());
        Circle circle3=new Circle(7);
        System.out.println(circle3.getArea());
        circle3.setRadius(0);
        System.out.println(circle3.getArea());



    }
}
