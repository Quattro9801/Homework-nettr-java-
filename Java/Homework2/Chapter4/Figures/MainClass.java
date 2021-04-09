package exercise4Chapter4;

public class MainClass {
    public static void main(String[] args) {
        Circle circle=new Circle(new Point(2, 0),4);
        System.out.println("Начальная точка окружности "+circle.getCenter());
        circle.moveBy(1,1);
        System.out.println("Конечная точка "+circle.getCenter());

        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println("Прямая");
        Line line=new Line(new Point(2,3),new Point(6,5));
        System.out.println("Центр прямой "+line.getCenter());
        System.out.println("///////////////////////////////////////////////////////////////")
        ;
        System.out.println("Прямоугольник");
        Rectangle rectangle = new Rectangle(new Point(0, 1), 70, 50);
        Rectangle cloned =  rectangle.clone();
        System.out.println("Исходный прямоугольник "+rectangle);
        System.out.println("Клонированный прямоугольник "+cloned);






    }
}
