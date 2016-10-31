package ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
 import java.util.regex.Pattern;
import java.util.stream.Collector;

/**
 * Created by alexey on 14.10.16.
 */
public class ex_6_2_15 {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        final int[] i = {0};
        in.lines().limit(1).flatMap(Pattern.compile(" ")::splitAsStream).
                filter(v -> (i[0]++) % 2 != 0).collect(Collector.of(
                ArrayDeque::new,
                (deq, t) -> deq.addFirst(t + " "),
                (d1, d2) -> {
                    d2.addAll(d1);
                    return d2;
                })).forEach(System.out::print);
    }
}
