package ex2;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by alexey on 09.09.16.
 */
public class ex_2_1_6 {


    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
       return   Arrays.asList(a , b, c, d).stream().filter(v -> v).count() == 2;


    }


    public static void main(String[] args) {






        if (booleanExpression(false , false , true , true) == true) {
            System.out.println("wrong");
        } else  {
            System.out.println("passed");
        }




    }




}
