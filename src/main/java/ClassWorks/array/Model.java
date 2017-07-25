package ClassWorks.array;

/**
 * Model Class
 * Contains result int
 */
class Model {
    private int length;
    private int[] array;
    private int[] array2;

    public int[] getArray() {
        return array;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public void setArray(int[] array) {
        this.array = array;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
