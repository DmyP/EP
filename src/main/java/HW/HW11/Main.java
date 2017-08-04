package HW.HW11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = null;

        //Task 1
        IntSorter task1 = new IntSorter();
        file = FileUtils.createFile("task1.txt");
        task1.generateRandomInts(file);
        task1.sortFileContents(file);

        //Task 2
        WordReplacer task2 = new WordReplacer();
        file = FileUtils.createFile("task2.txt");
        FileUtils.writeFile(file, "publicsticvoidmail 1public1");
        task2.replaceWords(file, "public", "private");

        //Task 3
        StringsReverser task3 = new StringsReverser();
        file = FileUtils.createFile("task3source.txt");
        File file2 = FileUtils.createFile("task3destination.txt");
        FileUtils.writeFile(file, "abcdefABCDEF\n1234567890\n!@#$%^&*");
        task3.reverseByStrings(file, file2);

        //Task 4
        CharsToUpperCase task4 = new CharsToUpperCase();
        file = FileUtils.createFile("task4.txt");
        FileUtils.writeFile(file, "A a AA aa Aaa aAA\nAaAa aAaA 12345");
        task4.fileToUpperCase(file);

    }

}
