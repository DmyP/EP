package HW.HW04;

class Model {
    final int RAND_MAX = 1000;
    final int TRIES = 10;
    private int randomNumber;
    private int min;
    private int max;


    int getRandomNumber() {
        return randomNumber;
    }

    void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    int getMin() {
        return min;
    }

    void setMin(int min) {
        this.min = min;
    }

    int getMax() {
        return max;
    }

    void setMax(int max) {
        this.max = max;
    }
}
