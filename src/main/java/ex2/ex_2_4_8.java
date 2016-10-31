package ex2;

import java.math.BigInteger;

/**
 * Created by alexey on 11.09.16.
 */
public class ex_2_4_8 {

    public static BigInteger factorial(int value) {
   return  value == 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial (value-1));
    }

    public static void main(String[] args) {

        System.out.println( factorial(3));

    }

}
