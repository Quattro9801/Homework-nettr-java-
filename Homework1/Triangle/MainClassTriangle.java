package Triangle;

public class MainClassTriangle {
    public static void main(String[] args) {

        Triangle triangle =new Triangle(new MyPoint(2,4), new MyPoint(3,6), new MyPoint(7,4));
        System.out.println( triangle +" is "+ triangle.getType() +" and has perimeter "+triangle.getPerimetr());
        System.out.println("///////////////////////////////////////");
        Triangle triangle1 =new Triangle(2,4,3,6,7,4);
        System.out.println( triangle1 +" is "+ triangle1.getType() +" and has perimeter "+triangle1.getPerimetr());




    }
}
