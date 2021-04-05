package exersice3Chapter1;

public class MaxValueClass {
   private double a;
   private double b;
   private double c;
    double result;



   public MaxValueClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public MaxValueClass() {

    }

    public double calculateMaxValue()
    {
        if (a>b && a>c)
        {
            return a;
        }
        else if (b>a && b>c )
        {
            return b;
        }
        return c;
    }
    public double calculateMaxValue1(double aa,double... mass)
    {
        a=result;
        for(double a:mass)
        {
           result=Math.max(a,result);


        }

        return result;
    }

    @Override
    public String toString() {
        return "MaxValueClass{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
