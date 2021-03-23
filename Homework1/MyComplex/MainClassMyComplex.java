package MyComplex;

public class MainClassMyComplex {
    public static void main(String[] args) {

        MyComplex c1 = new MyComplex(2, 0.0);
        System.out.println("First "+ c1);
        System.out.println(c1 + " is "+(c1.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(c1 + " is "+(c1.isImaginary() ? "" : "NOT")+" pure imaginary number");

        MyComplex c2 = new MyComplex(6.3, 4.0);
        System.out.println("Second  "+ c2);
        System.out.println(c2 + " is "+(c2.isReal() ? "" : "NOT")+" pure real number");
        System.out.println(c2 + " is "+(c2.isImaginary() ? "" : "NOT")+" pure imaginary number");

        System.out.println(c1+" is " +(c1.equals(c2) ? "":"NOT") +" equal to "+c2);
        System.out.println(c1+" + "+c2+" = "+c1.add(c2));
        System.out.println(c1+" - "+c2+" = "+c1.substract(c2));

    }
}
