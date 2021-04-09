package exercise1Chapter3;

public class Salary {

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects)
        {
           sum=sum+obj.getMeasure();
        }
        return sum/objects.length;

    }
    public static Measurable calculatemaxSalary(Measurable[] objects) {
        Measurable max = null;
        for (Measurable obj : objects) {
            if (max == null || obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;


    }

}
