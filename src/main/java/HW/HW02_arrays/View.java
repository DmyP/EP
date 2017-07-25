package HW02_arrays;

class View {
    static String TASK_1 = "\n1.  Array straight and reverse order - ";
    static String TASK_2  = "\n2.  Sum of ClassWorks.array elements - ";
    static String TASK_3  = "\n3.  Max element value - ";
    static String TASK_4 = "\n4.  Min element value and index - ";
    static String TASK_5 = "\n5.  Even elements in ClassWorks.array, and theirs sum (last line) - ";
    static String TASK_6 = "\n6.  Even elements in range and theirs sum (last line) - ";
    static String TASK_7  = "\n7.  Max Even and Min Odd element - ";
    static String TASK_8  = "\n8.  Switch negative to positive in ClassWorks.array - ";
    static String TASK_9  = "\n9.  Increment positive and decrement negative elements - ";
    static String TASK_10 = "\n10. Average arithmetic and number elements above average arithmetic - ";
    static String TASK_11 = "\n11. New ClassWorks.array, sum of two arrays elements pair to pair - ";
    static String TASK_12 = "\n12. Array concatenation - ";
    static String TASK_13 = "\n13. Swap max and min elements - ";
    static String TASK_14 = "\n14. Remove max and min elements - ";
    static String TASK_15 = "\n15. Divide ClassWorks.array into two (with negative and positive elements) - ";
    static String TASK_16 = "\n16. Create pair even ClassWorks.array from two source arrays - ";
    static String TASK_17 = "\n17. Print min and max and remove theirs duplicates - ";
    static String TASK_18 = "\n18. Determine two average arithmetic of arrays. Create new ClassWorks.array in range between two - ";

    static String GENERATE_ARRAY = "Do you like to use default ClassWorks.array (0) or input them (1) ?";
    static String TASK_NUMBER = "\nEnter task number to execute 1-18 (or 0 for all) - ";
    static String TRY_AGAIN = "Wrong. Please try again";
    static String GENERATED = "Successfully generated. Your ClassWorks.array is - ";
    static String INPUT_LENGTH = "Enter ClassWorks.array length (any positive integer)- ";
    static String INPUT_ARRAY  = "Enter every element of ClassWorks.array, pressing enter after each - ";
    static String NO_EVEN = "\tNo even elements";
    static String NO_ODD = "\tNo odd elements";
    static String BAD_ARRAY = "\nBad ClassWorks.array, sorry, try to create new one";

    void print(String string){
        if (string != null) {
            System.out.println(string);
        }
    }

    void print(int a){
        System.out.println("\t" + a);
    }
}
