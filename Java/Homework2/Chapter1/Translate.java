package exercise1Chapter1;

import java.math.BigInteger;

public class Translate {
  private int value;
  private String result="";

    public int getValue() {
        return value;
    }

    public Translate(int value) {
        this.value = value;
    }

    public String to2()
    {
      result = Integer.toBinaryString(value);
        return result;

    }
    public String to8()
    {

        result = Integer.toOctalString(value);
        return result;

    }
    public String to16()
    {
        result= Integer.toHexString(value).toUpperCase();
        return result;


    }

}
