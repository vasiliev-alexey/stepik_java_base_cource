package ex4;

/**
 * Created by alexey on 24.09.16.
 */
public class ex_4_1_9 {
    public static double sqrt(double x) {

        if (x < 0) throw
                new IllegalArgumentException(
                        String.format("Expected non-negative number, got %.2f" , x));
        return Math.sqrt(x); // your implementation here
    }

    public static void main(String[] args) {


        double result = sqrt(-1);
        System.out.println(result);

    }
}
