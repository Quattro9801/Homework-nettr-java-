package exercise1Chapter1;
import java.util.Formatter;
import java.util.Scanner;

public class MainclassTranslate {
    public static void main(String[] args) {

        Translate translate=new Translate(12143);
        System.out.println(("Двоичная запись числа "+translate.to2()));
        System.out.println(("Восьмиричная запись числа  "+translate.to8()));
        System.out.println(("Шестнадцатиричная запись числа  "+translate.to16()));
        System.out.println("Шестнадцатиричное с плавающей точкой"+translate.CalculateHexadecimalfloatinPpointNumber());
        System.out.println("//////////////////////////////////////////////////");
        translate.setValue(121);
        System.out.println(("Двоичная запись числа "+translate.to2()));
        System.out.println(("Восьмиричная запись числа "+translate.to8()));
        System.out.println(("Шестнадцатиричная запись числа "+translate.to16()));
        System.out.println("Шестнадцатиричное с плавающей точкой "+translate.CalculateHexadecimalfloatinPpointNumber());



    }
}
