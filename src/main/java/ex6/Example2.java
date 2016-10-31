package ex6;

import java.util.Optional;

/**
 * Created by alexey on 09.10.16.
 */
public class Example2<X> {

    public void someMethod(Object obj) {
      // X x = new X();
     //   X[] xx = new X[10];

     //   if (obj instanceof  X) {        };
        Object  o = (X) obj;

     // if (obj instanceof Optional<X>) ;
    Optional<X> xxx = Optional.empty();
    }

}
