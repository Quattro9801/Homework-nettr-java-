package Homework2.exercise5Chapter1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LotteryMain {
    public static void main(String[] args) {

        Lottery lottery=new Lottery(1,50);
        System.out.println("Исходное поле");
        System.out.println(lottery.formAList());
        System.out.println("--------------------------------------------------");
        System.out.println("Сгенерированные значения индексов листа "+lottery.fillTheArray());
        System.out.println("Комбинация из 6 цифр");
        System.out.println(lottery.calculateResult());
        System.out.println("Поле после выбора 6 чисел");
        System.out.println(lottery.showList());
       // System.out.println("Начальный список"+(Arrays.toString(lottery.formAList()));

    }
}



