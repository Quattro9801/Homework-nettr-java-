package Homework2.exercise5Chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery {
   private int minValue;
    private int maxValue;
   private int[] array=new int[6];
   private String result="";
   private  ArrayList<Integer> list = new ArrayList<Integer>();

    public static double calculateRandom(int min,int max)
    {
       return Math.round(Math.random()*((max-min))+min);
    }
    public String formAList() {


        for (int i = minValue; i < maxValue; i++) {
            list.add(i);
        }

        return String.valueOf(list);
    }
    public String showList()
    {
        return String.valueOf(list);
    }

 public  String fillTheArray()
 {
     for (int j = 0; j < array.length; j++) {
         array[j] = (int) calculateRandom(1,45);

     }
     return  Arrays.toString(array);
 }

    @Override
    public String toString() {
        return "Lottery{" +
                "minValue=" + minValue +
                ", maxValue=" + maxValue +
                ", list=" + String.valueOf(list) +
                '}';
    }

    public  String calculateResult()
 {
     for (int j = 0; j < array.length; j++) {

         result = result + " " + list.remove(array[j]) ;
     }
     String[] array = (result.replaceAll("\\D+", " ").trim()).split(" ");
     int[] c = new int[array.length];
     for (int i = 0; i < array.length; i++) {
         c[i] = Integer.valueOf(array[i]);
     }
     Arrays.sort(c);

     return Arrays.toString(c);

 }
    public Lottery(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
