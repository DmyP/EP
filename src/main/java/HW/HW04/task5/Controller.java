package HW.HW04.task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Controller {
    private Model model;
    private View view;

    Controller() {
        this.model = new Model();
        this.view = new View();
    }

    void start() {
        //Getting guessed number
        initInt();

        //Starting game
        game();
    }

    //Getting random (default or input range)
    private void initInt() {
        print(View.GENERATE_RANGE);
        switch (getInt(0, 1)) {
            case 0:
                model.setRandomNumber(rand());
                break;
            case 1:
                manualRangeInput();
                model.setRandomNumber(rand(model.getMin(), model.getMax()));
                break;
        }
    }

    //Random with default
    private int rand() {
        model.setMin(0);
        model.setMax(model.RAND_MAX);
        return rand(model.getMin(), model.getMax());
    }

    //Random with chosen range
    int rand(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    //manual range input
    private void manualRangeInput() {
        int min, max;
        do {
            print(View.GENERATE_MIN);
            min = getInt(0, Integer.MAX_VALUE);
            print(View.GENERATE_MAX);
            max = getInt(min, Integer.MAX_VALUE);
            print((min >= max) ? View.MIN_MAX_BAD : View.MIN_MAX_OK);
        } while (min >= max);
        model.setMin(min);
        model.setMax(max);
    }

    //Guess game itself
    private void game() {
        print(View.GENERATED);
        print(View.RANGE + Arrays.toString(new int[]{model.getMin(), model.getMax()}));

        int supposedNum;
        int counter = 1;
        int[] triesArray = new int[model.TRIES];

        while (((supposedNum = getInt(model.getMin(), model.getMax())) != model.getRandomNumber()) & (counter < model.TRIES)) {
            triesArray[counter - 1] = supposedNum;
            print(supposedNum > model.getRandomNumber() ? View.SMALLER : View.BIGGER);
            print(View.RANGE + Arrays.toString(new int[]{model.getMin(), model.getMax()}));
            print(View.PREVIOUS_TRIES + Arrays.toString(triesArray));
            print(View.TRIES_LEFT + (model.TRIES - counter));
            counter++;
        }

        print(counter != model.TRIES ? View.YOU_WIN + counter : View.YOU_LOST);
    }

    //Get int input in desired range
    private int getInt(int from, int to) {
        Scanner scanner = new Scanner(System.in);
        int result;
        while (((result = Integer.valueOf(scanner.nextLine())) < from) || (result > to)) {
            print(View.TRY_AGAIN);
        }
        return result;
    }

    //Prints string
    private void print(String string) {
        view.print(string);
    }
}
