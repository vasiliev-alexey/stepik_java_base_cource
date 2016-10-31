package ex5;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by alexey on 04.10.16.
 */
public class ex_5_1_8 {

    public static void main(String[] args) {

        File f = new File("");
        Path p = Paths.get("/home/alexey");
        System.out.println(p.getRoot());


    }

}
