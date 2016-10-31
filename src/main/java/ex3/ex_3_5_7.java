package ex3;

import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created by alexey on 19.09.16.
 */
public class ex_3_5_7 {
    public static double integrate2(DoubleUnaryOperator f, double a, double b) {
        double step = 1E-7;
        return (java.util.stream.DoubleStream.iterate(a, iter -> iter +  step)
                .limit((long) ((b - a) / step+1))
                .reduce((s1, s2) -> s1 + f.applyAsDouble( s2) *step)
                .getAsDouble());

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 1E-7;
        double result = 0;
        int j = 0;

        for (int i = 0; (a + step * i) < b; i++) {
            result += f.applyAsDouble(a + step * i) * step;
            j++;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));

        System.out.println(integrate2(x -> 1, 0, 10));

    }

}
