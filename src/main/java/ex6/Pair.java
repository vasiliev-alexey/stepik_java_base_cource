package ex6;

/**
 * Created by alexey on 07.10.16.
 */
 class Pair <F, S> {

    private final F first;
    private final S second;

    
    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }



    public static <F, S> Pair<F, S> of(F first, S second) {


        return new Pair(first , second);

    }

     
    public S getSecond() {
        return second;
    }

    public F getFirst() {
        return first;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
        return second != null ? second.equals(pair.second) : pair.second == null;

    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }
}
