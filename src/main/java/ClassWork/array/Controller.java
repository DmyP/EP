package ClassWorks.array;

import java.util.Scanner;

/**
 * Controller Class
 * Controls View and Model
 * Main method startMVC, starts utility methods in desired order.
 */
class Controller {
    private Model model;
    private View view;
    private Scanner scanner = new Scanner(System.in);

    Controller() {
        this.model = new Model();
        this.view = new View();
    }

    void startMVC() {
        init();

        print(View.TASK_1);
        arrayOrder(model.getArray());
        arrayReverseOrder(model.getArray());

        print(View.TASK_2);
        sumArrayElements(model.getArray());

        print(View.TASK_3);
        maxArrayElement(model.getArray());

        print(View.TASK_4);
        minArrayElement(model.getArray());

        print(View.TASK_5);
        evenElement(model.getArray());

        print(View.TASK_6);
        evenElementArea(model.getArray(), 20, 30);

        print(View.TASK_7);
        minOddMaxEven(model.getArray());

        print(View.TASK_8);
        negativeToPositive(model.getArray());

        print(View.TASK_9);
        incrementDecrement(model.getArray());

        print(View.TASK_10);
        averageAndNumAbove(model.getArray());

        print(View.TASK_11);
        newArraySumPairs(model.getArray());

        print(View.TASK_12);
        arrayConcatenation(model.getArray());
    }



    private void init () {
        //Asking input length
        print(View.INPUT_LENGTH);

        //Setting length to model
        model.setLength(inputInt());
        int[] array = new int[model.getLength()];

        //Asking input ClassWorks.array
        print(View.INPUT_ARRAY);
        for (int i = 0; i < model.getLength(); i++) {
            array[i] = inputInt();
        }
        //Setting Array to model
        model.setArray(array);

        //Setting array2 for tasks 10-11
        int[] otherArray = new int[model.getLength() * 2];
        System.arraycopy(model.getArray(), 0, model.getArray2(), 0, model.getLength());
        System.arraycopy(model.getArray(), 0, model.getArray2(), model.getLength(), model.getLength());
    }

    private void arrayOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            print(array[i]);
        }
    }

    private void arrayReverseOrder(int[] array) {
        for (int i = array.length - 1; i <= 0; i--) {
            print(array[i]);
        }
    }

    private void sumArrayElements(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            sum += array[i];
        }
        print(sum);
    }

    private void maxArrayElement(int[] array) {
        int max = array[0];
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] > max){
                max = array[i];
            }
        }
        print(max);
    }

    private void minArrayElement(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        print(min, index);
    }

    private void evenElement(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] % 2 == 0){
                print(array[i]);
                sum += array[i];
            }
        }
        if (sum > 0) {
            print(sum);
        }
    }

    private void evenElementArea(int[] array, int a, int b) {
        int sum = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            if ((array[i] > a) & (array[i] < b)) {
                if (array[i] % 2 == 0){
                    print(array[i]);
                    sum += array[i];
                }
            }
        }
        if (sum > 0) {
            print(sum);
        }
    }

    private void minOddMaxEven(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] % 2 == 0){
                if (max < array[i]){
                    max = array[i];
                } else if (min > array[i]){
                    min = array[i];
                }

            }
        }
        print(max, min);
    }

    private void negativeToPositive(int[] array) {
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] < 0){
                array[i] = Math.abs(array[i]);
            }
        }
        print(array);
    }

    private void incrementDecrement(int[] array) {
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] < 0){
                array[i] = array[i] - 1;
            } else if (array[i] > 0){
                array[i] = array[i] + 1;
            }
        }
        print(array);
    }

    private void averageAndNumAbove(int[] array) {
        int sum = 0, average = 0, quantity = 0;
        for (int i = array.length - 1; i <= 0; i--) {
            sum += array[i];
        }
        average = sum / array.length;
        for (int i = array.length - 1; i <= 0; i--) {
            if (array[i] > average) {
                quantity++;
            }
        }
        print(average, quantity);
    }

    private void newArraySumPairs(int[] array) {
        int[] otherArray = array;
        int[] resultArray = new int[array.length];
        for (int i = array.length -1 ; i >= 0 ; i--) {
            resultArray[i] = array[i] + otherArray[i];
        }
        print(resultArray);
    }

    private void arrayConcatenation(int[] array) {

    }





    private int inputInt() {
        return scanner.nextInt();
    }

    private void print(String string) {
        view.print(string);
    }

    private void print(int number) {
        view.print(number);
    }

    private void print(int a, int b) {
        view.print(a, b);
    }

    private void print(int[] array) {
        view.print(array);
    }
}
