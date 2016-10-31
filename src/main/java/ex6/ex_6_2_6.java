package ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by alexey on 15.10.16.
 */
public class ex_6_2_6 {

    public static void main(String[] args) {
        Collection<?> collection = new ArrayList<>();
        Object object = new Object();
      //  collection.addAll(Arrays.asList(object));
        collection.remove(object);
        collection.clear();
       // collection.add(object);
        collection.iterator();
        collection.size();
        collection.toArray();
        collection.contains(object);


    }
}


