package exersice3Chapter1;

public class MainClassMaxValue {
    public static void main(String[] args) {

       MaxValueClass maxValueClass=new MaxValueClass(1,2,3);
        System.out.println("Самое большое из 3-ех чисел="+maxValueClass.calculateMaxValue());
        MaxValueClass maxValueClass1=new MaxValueClass();
        System.out.println("Самое большое из 3-ех чисел="+maxValueClass.calculateMaxValue1(3.4,8.4,5));

    }

}
