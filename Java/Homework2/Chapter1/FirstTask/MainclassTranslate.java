package exercise1Chapter1;

public class MainclassTranslate {
    public static void main(String[] args) {

        Translate translate=new Translate(121233);
        System.out.println(String.valueOf(translate.to2()));
        System.out.println(String.valueOf(translate.to8()));
        System.out.println(String.valueOf(translate.to16()));
        ///Не нашел как вывести число в шестнадцатиричном формате с плавающей точкой

    }
}
