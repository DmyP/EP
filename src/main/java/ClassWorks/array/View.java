package ClassWorks.array;

import java.util.Arrays;

/**
 * View Class
 * Contains String constants and print method
 */
class View {
    static String INPUT_LENGTH = "Enter ClassWorks.array length - ";
    static String INPUT_ARRAY = "Enter ClassWorks.array - ";
    static String TASK_1 = "Array order and reverse - ";
    static String TASK_2 = "Sum of elements - ";
    static String TASK_3 = "Max element in ClassWorks.array - ";
    static String TASK_4 = "Min element in ClassWorks.array - ";
    static String TASK_5 = "Even elements and sum - ";
    static String TASK_6 = "Even elements and sum in area - ";
    static String TASK_7 = "Max Odd & Min Even elements - ";
    static String TASK_8 = "Switch negative to positive - ";
    static String TASK_9 = "Increment positive and decrement negative - ";
    static String TASK_10 = "Average element and number elements above average - ";
    static String TASK_11 = "New ClassWorks.array sum of two arrays elements pair to pair - ";
    static String TASK_12 = "Array concatenation - ";

    void print(String string){
        if (string != null) {
            System.out.println(string);
        }
    }

    void print(int a){
        System.out.println(a);
    }

    void print(int a, int b){
        System.out.println(a + ", " + b);
    }

    void print(int[] array){
        Arrays.toString(array);
    }
}
