package ex2;

import java.util.stream.Stream;

/**
 * Created by alexey on 09.09.16.
 */



public class ex_2_1_8 {

    public static int leapYearCount(int year) {
        return (int) java.util.stream.Stream.iterate(1, n -> ++n).limit(year).filter(
                v -> (v%400 ==0 || v%4 == 0 && v%100 !=0)
        ).count();
    }
    public static void main(String[] args) {

        System.out.println(  leapYearCount(100));


    }


}
