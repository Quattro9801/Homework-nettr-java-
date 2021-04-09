package exersice3Chapter1;

public class MaxValueClass {
   private int a;
   private int otherA;
   private int b;
   private int c;
   private int result;
   int[] mass=new int[3];





   public MaxValueClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public String calculateMaxValue()
    {

        String equal=" Все числа равны";
        if (a>b && a>c)
        {
            return String.valueOf(a);
        }
        else if (b>a && b>c )
        {
            return String.valueOf(b);
        }
        else if (c>a && c>b ) {
            return String.valueOf(c);
        };
        return equal ;
    }
    public int calculateMaxValue1(int a,int ...mass)
    {
      result=a;
        for(int aa:mass)
        {
           result=Integer.valueOf((int) Math.max(aa,result));

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
