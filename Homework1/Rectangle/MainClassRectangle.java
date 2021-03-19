package com.MyCompany.Rectangle;

public class MainClassRectangle {
    public static void main(String[] args) {
    Rectangle rectangle=new Rectangle();
        System.out.println("First rectangle");
        System.out.println(rectangle);
        System.out.println("Perimetr = "+rectangle.getPerimetr());
        System.out.println("Area = "+ rectangle.getArea());
        System.out.println("////////////////////////////////////");
        ///////////////////////////////////////////////////
        Rectangle rectangle1=new Rectangle(5f, 6f);
        System.out.println("Second rectangle");
        System.out.println(rectangle1);
        System.out.println("Perimetr = "+ rectangle1.getPerimetr());
        System.out.println("Area = "+ rectangle1.getArea());
        System.out.println("////////////////////////////////////");
        //////////////////////////////////////////
        rectangle1.setLenght(10f);// переопределили значения переменных
        rectangle1.setWidth(20f);
        System.out.println("Third rectangle");
        System.out.println(rectangle1);
        System.out.println("Perimetr = "+ rectangle1.getPerimetr());
        System.out.println("Area = "+ rectangle1.getArea());
    }
}
