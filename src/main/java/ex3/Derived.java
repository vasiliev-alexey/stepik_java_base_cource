package ex3;

/**
 * Created by alexey on 22.09.16.
 */
public class Derived extends  Base {

    @Override
    public Child test() {
        return new Child();
    }
}
