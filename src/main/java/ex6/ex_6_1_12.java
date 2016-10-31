package ex6;

import org.junit.Assert;

import java.time.DayOfWeek;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by alexey on 07.10.16.
 */
public class ex_6_1_12 {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Optional<String> o = Optional.of("");

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        Assert.assertTrue("condition 1 not " , mustBeTrue);

        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        Assert.assertTrue("condition 2 not " , mustAlsoBeTrue);



        Example<DayOfWeek> r;
        Example<Objects> r1;
        Example<CharSequence> r2;
        //Example<Object::toString> r2;
        Example<? extends  Object> r4;
    }

}
