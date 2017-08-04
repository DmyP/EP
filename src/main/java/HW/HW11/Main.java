package HW.HW11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File sourceFile = null;
        File resultFile = null;

        //Task 1
        IntSorter task1 = new IntSorter();
        sourceFile = FileUtils.createFile("task1.txt");
        resultFile = FileUtils.createFile("task1sortedInt.txt");
        task1.generateRandomInt(sourceFile);
        task1.sortFileContents(sourceFile, resultFile);

        //Task 2
        WordReplacer task2 = new WordReplacer();
        sourceFile = FileUtils.createFile("task2.txt");
        FileUtils.writeFile(sourceFile, "publicsticvoidmail 1public1");
        resultFile = FileUtils.createFile("task2replacedWords.txt");
        task2.replaceWords(sourceFile, resultFile,"public", "private");

        //Task 3
        StringsReverser task3 = new StringsReverser();
        sourceFile = FileUtils.createFile("task3.txt");
        resultFile = FileUtils.createFile("task3reverseStrings.txt");
        FileUtils.writeFile(sourceFile, "abcdefABCDEF\n1234567890\n!@#$%^&*");
        task3.reverseByStrings(sourceFile, resultFile);

        //Task 4
        CharsToUpperCase task4 = new CharsToUpperCase();
        sourceFile = FileUtils.createFile("task4.txt");
        FileUtils.writeFile(sourceFile, "A a AA aa Aaa aAA\nAaAa aAaA 12345");
        resultFile = FileUtils.createFile("task4UpperCase.txt");
        task4.fileToUpperCase(sourceFile, resultFile);

    }

}
