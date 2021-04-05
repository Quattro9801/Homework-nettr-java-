package exercise6Chapter1;

import java.math.BigInteger;

public class Factorial {

    public BigInteger calculateFactorial(int n)
    {
        BigInteger bigInteger = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }



}
