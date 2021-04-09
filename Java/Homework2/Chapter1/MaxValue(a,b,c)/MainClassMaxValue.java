package exersice3Chapter1;

public class MainClassMaxValue {
    public static void main(String[] args) {

       MaxValueClass maxValueClass=new MaxValueClass(9,2,30);
        System.out.println("Самое большое из 3-ех чисел="+maxValueClass.calculateMaxValue());
        System.out.println("Самое большое из 3-ех чисел="+maxValueClass.calculateMaxValue1(maxValueClass.calculateMaxValue1(9,2,30)));

    }

}
