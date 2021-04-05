package exercise6Chapter1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class MainClassFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение");
        int n= in.nextInt();
        Factorial factorial = new Factorial();
        System.out.println("Факториал числа" + " " + n + " = " + factorial.calculateFactorial(n));


    }
}

