package ex5;

import java.io.IOException;

/**
 * Created by alexey on 05.10.16.
 */
public class ex_5_3_10 {


        public static void main(String[] args) throws IOException {
            byte[] bytes = "Ы".getBytes();
            for (int i = 0; i < bytes.length; i++) {
                System.out.println(Byte.toUnsignedInt(bytes[i]));
            }


    }
}
