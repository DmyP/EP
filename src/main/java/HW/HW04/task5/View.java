package HW.HW04.task5;

class View {
    static String GENERATE_RANGE = "Press 0 if you want to use default range, or 1 to enter range manually - ";
    static String GENERATE_MIN = "Enter MIN value (any int) : ";
    static String GENERATE_MAX = "Enter MAX value (any int) : ";

    static String MIN_MAX_BAD = "MIN >= MAX, please try again";
    static String TRY_AGAIN = "Wrong input. Please try again";
    static String MIN_MAX_OK = "MIN, MAX OK. Generating random int in your range.";

    static String GENERATED = "Number generated! Try to guess it)\n";
    static String TRIES_LEFT = "Number of tries left - ";
    static String RANGE = "Number is in range of - ";
    static String SMALLER = "Incorrect, too big, try smaller one ";
    static String BIGGER = "Incorrect, too small, try bigger one ";
    static String PREVIOUS_TRIES = "your previous tries were - ";
    static String YOU_WIN = "YOU WIN!!!! Number of tries - ";
    static String YOU_LOST = "SORRY, YOU DID NOT GUESS THE NUMBER!!";



    void print(String string){
        if (string != null) {
            System.out.println(string);
        }
    }

    void print(int a){
        System.out.println("\t" + a);
    }
}
