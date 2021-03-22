
package MyPolynomial;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MainClassMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial myPolynomial1= new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial myPolynomial2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);

        System.out.println("First Polinom: "+myPolynomial1);
        System.out.println("Second polinom p2: "+myPolynomial2);
        System.out.println("When X=4, value = : "+myPolynomial1.evaluate(4));
        System.out.println("Sum p1 and p2: "+myPolynomial1.add(myPolynomial2));




    }
}
