package ClassWorks.except;

import java.io.EOFException;

public class Sample2 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        try {

            System.out.println(10/0);
            System.out.println(arr[99]);

        }

        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        /*
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }*/

        /*catch (ArrayIndexOutOfBoundsException e) {
          //  e.printStackTrace();
            System.out.println(e.toString() + " length is" + arr.length);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
