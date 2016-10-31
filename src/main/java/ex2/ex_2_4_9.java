package ex2;

import java.util.*;

/**
 * Created by alexey on 11.09.16.
 */
public class ex_2_4_9 {

    public static int[] mergeArrays(int[] a1, int[] a2) {

        int[] c= new int[a1.length+a2.length];
        System.arraycopy(a1, 0, c, 0, a1.length);
        System.arraycopy(a2, 0, c, a1.length, a2.length);
          Arrays.sort(c);
        return c;




    }


    public static void main(String[] args) {

        int a [] = {0 , 2};
        int b[] = {1 , 3};

        int c [] = mergeArrays(a , b);


        for (int i = 0; i <  c.length; i++) {
            System.out.println(c[i]);
        }



    }

}
