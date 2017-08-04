package ClassWorks.scan;

import java.util.Scanner;

public class Scann {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int i = Integer.parseInt(scanner.next());
            System.out.println((char) 27 + "[1m" + i);
            System.out.println((char) 27 + "[30m" + i);
            System.out.println((char) 27 + "[31m" + i);
            System.out.println((char) 27 + "[32m" + i);
            System.out.println((char) 27 + "[33m" + i);
            System.out.println((char) 27 + "[34m" + i);
            System.out.println((char) 27 + "[35m" + i);
            System.out.println((char) 27 + "[36m" + i);
            System.out.println((char) 27 + "[37m" + i);
            System.out.println((char) 27 + "[38m" + i);
            System.out.println((char) 27 + "[39m" + i);
        }

    }
}
