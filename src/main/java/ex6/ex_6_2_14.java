package ex6;

import org.junit.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by alexey on 14.10.16.
 */
public class ex_6_2_14 {

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> rez =  set2.stream().filter(v2 -> !set1.contains(v2)).collect(java.util.stream.Collectors.toSet());
        rez.addAll (set1.stream().filter( v  -> !set2.contains(v)).collect(java.util.stream.Collectors.toSet())
        );
        return rez;



    }

    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>() ;
        h1.addAll(Arrays.asList(1, 2, 3));
        HashSet<Integer> h2 = new HashSet<>() ;
        h2.addAll(Arrays.asList(0, 1, 2));

        Set<Integer> rez = symmetricDifference(h1 ,h2);

        System.out.println(rez);




    }

}
