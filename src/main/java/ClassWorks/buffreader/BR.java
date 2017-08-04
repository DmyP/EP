package ClassWorks.buffreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR {

    public static void main(String[] args) throws IOException {
        //                                      strings              symbols        bytes
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        for (;;) {

            //int i = bufferedReader.read();

            //int i = System.in.read();

            int i = new InputStreamReader(System.in).read();
            System.out.println((char) i);
            System.out.println(i);

        }
    }
}
