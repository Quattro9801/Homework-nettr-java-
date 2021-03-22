package Ball;

public class MainClassBall {
    public static void main(String[] args) {
        Ball b = new Ball(50, 50, 30, 10, 45);

        System.out.println("The X coordinate of ball is: "+b.getX());
        System.out.println("The Y coordinate of ball is: "+b.getY());
        System.out.println("The Radius of ball is: "+b.getRadius());
        System.out.println(b);
        b.setRadius(20);
        System.out.println(b);

        b.setXY(300, 300);
        System.out.println(b);

        b.reflectHorizontal();
        b.move();
        System.out.println(b);

        b.reflectVertical();
        b.move();
        System.out.println(b);

        Container c=new Container(1,10,9,6);
        System.out.println(c.collidesWith(b));
        b.move();
        System.out.println(b);


    }
}
