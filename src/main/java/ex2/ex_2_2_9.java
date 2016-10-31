package ex2;

import static java.lang.Math.abs;

/**
 * Created by alexey on 10.09.16.
 */
public class ex_2_2_9 {



    public static boolean isPowerOfTwo(int value) {
        System.out.println(Integer.toBinaryString(value));

        return  Integer.toBinaryString(abs(value)).endsWith("0") &&
                Integer.toBinaryString(abs(value)).indexOf('0')==-1;
    }
    public static void main(String[] args) {


        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(-2));


    }
}
