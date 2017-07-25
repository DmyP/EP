package HW02_arrays;

import java.util.Arrays;
import java.util.Scanner;

class Controller {
    private Model model;
    private View view;
    private int taskQuantity;
    private Scanner scanner;

    Controller() {
        this.model = new Model();
        this.view = new View();
        this.scanner = new Scanner(System.in);
    }

    void init () {
        taskQuantity = 18;
        print(View.GENERATE_ARRAY);
        switch (getInt(0, 1)) {
            case 0:
                model.setArray(generateRandomArray((int) (Math.random() * 20)));
                break;
            case 1:
                inputArray();
                break;
        }
        print(View.GENERATED);
        print(Arrays.toString(model.getArray()));
    }

    private int[] generateRandomArray(int length) {
        int[] randomArray = new int[length];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100 - 50);
        }
        return randomArray;
    }

    private void inputArray() {
        print(View.INPUT_LENGTH);
        int[] array = new int[getInt(1, Integer.MAX_VALUE)];

        print(View.INPUT_ARRAY);
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        model.setArray(array);
    }

    void selectTaskToRun() {
        int desiredTask = -1;
        while ((desiredTask < 0) | (desiredTask > taskQuantity)) {
            print(View.TASK_NUMBER);
            desiredTask = scanner.nextInt();
        }
        if (desiredTask == 0) {
            for (int i = 1; i <= taskQuantity; i++) {
                runTask(i);
            }
        } else {
            runTask(desiredTask);
        }
    }

    private void runTask(int i) {
        switch (i) {
            default :
                checkArray(model.getArray());
                break;
            case 1:
                arrayStraightAndReverseOrder(model.getArray());
                break;
            case 2:
                sumArrayElements(model.getArray());
                break;
            case 3:
                maxArrayElement(model.getArray());
                break;
            case 4:
                minArrayElement(model.getArray());
                break;
            case 5:
                evenElement(model.getArray());
                break;
            case 6:
                evenElementInRange(model.getArray(), -20, 20);
                break;
            case 7:
                maxEvenMinOdd(model.getArray());
                break;
            case 8:
                negativeToPositive(model.getArray());
                break;
            case 9:
                incrementPosDecrementNeg(model.getArray());
                break;
            case 10:
                averageAndNumAboveAverage(model.getArray());
                break;
            case 11:
                newArraySumPairs(model.getArray());
                break;
            case 12:
                arrayConcatenation(model.getArray());
                break;
            case 13:
                swapMaxMin(model.getArray());
                break;
            case 14:
                removeMaxMin(model.getArray());
                break;
            case 15:
                divideToTwoPosNegArrays(model.getArray());
                break;
            case 16:
                pairEvenArrays(model.getArray());
                break;
            case 17:
                removeMaxMinDuplicates(model.getArray());
                break;
            case 18:
                arrayTwoArraysAverageRange(model.getArray());
                break;
        }
    }




    private void arrayStraightAndReverseOrder(int[] array) {
        print(View.TASK_1);
        print(array);

        int[] reverseOrderArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseOrderArray[i] = array[array.length - i - 1];
        }

        print(reverseOrderArray);
    }

    private void sumArrayElements(int[] array) {
        print(View.TASK_2);
        print(array);

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        print(sum);
    }

    private void maxArrayElement(int[] array) {
        print(View.TASK_3);
        print(array);

        int[] minMax = searchMinMax(array);

        print(array[minMax[1]]);
    }

    private void minArrayElement(int[] array) {
        print(View.TASK_4);

        int[] minMax = searchMinMax(array);

        print(array[minMax[0]]);
        print(minMax[0]);
    }

    private void evenElement(int[] array) {
        print(View.TASK_5);
        print(array);

        int sum = Integer.MIN_VALUE;
        for (int element : array) {
            if (element % 2 == 0) {
                print(element);
                sum = (sum == Integer.MIN_VALUE ? element : sum + element);
            }
        }

        print(sum == Integer.MIN_VALUE ? View.NO_EVEN : String.valueOf(sum));
    }

    private void evenElementInRange(int[] array, int a, int b) {
        print(View.TASK_6);
        print(array);

        int sum = Integer.MIN_VALUE;
        for (int element : array) {
            if ((element >= a) & (element <= b)) {
                if (element % 2 == 0) {
                    print(element);
                    sum = (sum == Integer.MIN_VALUE ? element : sum + element);
                }
            }
        }

        print(sum == Integer.MIN_VALUE ? View.NO_EVEN : String.valueOf(sum));
    }

    private void maxEvenMinOdd(int[] array) {
        print(View.TASK_7);
        print(array);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int element : array) {
            if ((element % 2 == 0) & (max < element)) {
                max = element;
            }
            if ((element % 2 != 0) & (min > element)) {
                min = element;
            }
        }

        print(max == Integer.MIN_VALUE ? View.NO_EVEN : String.valueOf(max));
        print(min == Integer.MAX_VALUE ? View.NO_ODD : String.valueOf(min));
    }

    private void negativeToPositive(int[] array) {
        print(View.TASK_8);
        print(array);

        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = (array[i] > 0 ? array[i] : Math.abs(array[i]));
        }

        print(tempArray);
    }

    private void incrementPosDecrementNeg(int[] array) {
        print(View.TASK_9);
        print(array);

        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = (array[i] == Math.abs(array[i]) ? array[i] + 1 : array[i] - 1);
        }

        print(tempArray);
    }

    private void averageAndNumAboveAverage(int[] array) {
        print(View.TASK_10);
        print(array);

        int sum = 0;
        for (int element : array) {
            sum += element;
        }

        int quantity = 0;
        int average = sum / array.length;
        for (int element : array) {
            quantity = (element > average ? quantity + 1 : quantity);
        }

        print(average);
        print(quantity);
    }

    private void newArraySumPairs(int[] array) {
        print(View.TASK_11);
        print(array);

        int[] generatedArray = generateRandomArray(array.length);
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i] + generatedArray[i];
        }

        print(generatedArray);
        print(resultArray);
    }

    private void arrayConcatenation(int[] array) {
        print(View.TASK_12);
        print(array);

        int[] newArray = generateRandomArray(array.length * (int) (Math.random() * 10));
        int[] resultArray = new int[array.length + newArray.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            resultArray[i + array.length] = newArray[i];
        }

        print(newArray);
        print(resultArray);
    }

    private void swapMaxMin(int[] array) {
        print(View.TASK_13);
        print(array);

        int[] minMax = searchMinMax(array);
        int[] resultArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultArray[i] = array[i];
        }
        int tmp = resultArray[minMax[0]];
        resultArray[minMax[0]] = resultArray[minMax[1]];
        resultArray[minMax[1]] = tmp;

        print(resultArray);
    }

    private void removeMaxMin(int[] array) {
        print(View.TASK_14);
        print(array);

        int[] minMax = searchMinMax(array);
        int[] resultArray = new int[array.length - 2];
        int k = 0;
        for (int element : array) {
            if ((element != array[minMax[1]]) & (element != array[minMax[0]])) {
                resultArray[k] = element;
                k++;
            }
        }

        print(resultArray);
    }

    private void divideToTwoPosNegArrays(int[] array) {
        print(View.TASK_15);

        int posAmount = 0, negAmount = 0;
        for (int element : array) {
            if (element != Math.abs(element)) {
                negAmount++;
            } else {
                posAmount++;
            }
        }
        int[] posArray = new int[posAmount];
        int[] negArray = new int[negAmount];

        int posIndex = 0, negInd = 0;
        for (int element : array) {
            if (element != Math.abs(element)) {
                negArray[negInd] = element;
                negInd++;
            } else {
                posArray[posIndex] = element;
                posIndex++;
            }
        }

        print(array);
        print(posArray);
        print(negArray);
    }

    private void pairEvenArrays (int[] array) {
        print(View.TASK_16);

        int[] generatedArray = generateRandomArray(array.length);
        int[] tmpArray = new int[generatedArray.length + array.length];
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if((generatedArray[i] % 2 != 0) && (array[i] % 2 != 0)){
                tmpArray[counter] = array[i];
                counter++;
                tmpArray[counter] = generatedArray[i];
                counter++;
            }
        }
        int[] resultArray = new int[counter];
        for(int i = 0; i < counter; i++){
            resultArray[i] = tmpArray[i];
        }

        print(array);
        print(generatedArray);
        print(resultArray);
    }

    private void removeMaxMinDuplicates(int[] array) {
        print(View.TASK_17);
        print(array);

        int[] minMax = searchMinMax(array);
        int[] tempArray = new int[array.length];
        boolean minCountFlag = false, maxCountFlag = false;
        int tempArrayCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == array[minMax[0]]) & (!minCountFlag)) {
                tempArray[tempArrayCounter] = array[i];
                tempArrayCounter++;
                minCountFlag = true;
            } else if ((array[i] == array[minMax[1]]) & (!maxCountFlag)) {
                tempArray[tempArrayCounter] = array[i];
                tempArrayCounter++;
                maxCountFlag = true;
            }  else if ((array[i] != array[minMax[0]]) & (array[i] != array[minMax[1]])){
                tempArray[tempArrayCounter] = array[i];
                tempArrayCounter++;
            }
        }
        int[] resultArray = new int[tempArrayCounter];
        for (int i = 0; i < tempArrayCounter; i++) {
            resultArray[i] = tempArray[i];
        }

        print(array[minMax[0]]);
        print(array[minMax[1]]);
        print(resultArray);
    }

    private void arrayTwoArraysAverageRange(int[] array) {
        print(View.TASK_18);
        print(array);

        int[] generatedArray = generateRandomArray(array.length);
        int averageFirst = 0, averageSecond = 0;
        for (int element : array) {
            averageFirst += element;
        }
        averageFirst = averageFirst / array.length;

        for (int element : generatedArray) {
            averageSecond += element;
        }
        averageSecond = averageSecond / array.length;

        int counter = 0;
        int[] tempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > averageFirst) & (array[i] < averageSecond)) {
                tempArray[i] = array[i];
                counter++;
            }
        }

        int[] resultArray = new int[counter];
        for (int i = 0; i < counter; i++) {
            resultArray[i] = tempArray[i];
        }

        print(averageFirst);
        print(generatedArray);
        print(averageSecond);
        print(resultArray);
    }

    //Utility method, checks ClassWorks.array for not null and length
    private void checkArray(int[] array) {
        if ((array == null) || (array.length > 1)) {
            print(View.BAD_ARRAY);
            System.exit(1);
        }
    }

    //Utility method, get int input in desired range
    private int getInt(int from, int to) {
        int result;
        while (((result = Integer.valueOf(scanner.nextLine())) < from) || (result > to)) {
            print(View.TRY_AGAIN);
        }
        return result;
    }

    //Utility method, Search min max in ClassWorks.array and returns int[minPosition, maxPosition];
    private int[] searchMinMax(int[] array) {
        int minPos = 0, maxPos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minPos]) {
                minPos = i;
            }
            if (array[i] > array[maxPos]) {
                maxPos = i;
            }
        }
        return new int[]{minPos, maxPos};
    }

    //Utility print method, to output string
    private void print(String string) {
        view.print(string);
    }

    //Utility overloaded print method, to output int
    private void print(int number) {
        view.print("\t" + String.valueOf(number));
    }

    //Utility overloaded print method, to output ClassWorks.array
    private void print(int[] tempArray) {
        print("\t" + Arrays.toString(tempArray));
    }
}