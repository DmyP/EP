package HW.HW11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File sourceFile = null;
        File resultFile = null;

        //Task 1
        sourceFile = FileUtils.createFile("task1.txt");
        resultFile = FileUtils.createFile("task1sortedInt.txt");

        FileUtils.generateRandomInt(sourceFile);
        TaskUtils.sortFileContents(sourceFile, resultFile);

        //Task 2
        sourceFile = FileUtils.createFile("task2.txt");
        resultFile = FileUtils.createFile("task2replacedWords.txt");

        FileUtils.writeFile(sourceFile, "publicsticvoidmail 1public1");
        TaskUtils.replaceWords(sourceFile, resultFile,"public", "private");

        //Task 3
        sourceFile = FileUtils.createFile("task3.txt");
        resultFile = FileUtils.createFile("task3reverseStrings.txt");

        FileUtils.writeFile(sourceFile, "abcdefABCDEF\n1234567890\n!@#$%^&*");
        TaskUtils.reverseByStrings(sourceFile, resultFile);

        //Task 4
        sourceFile = FileUtils.createFile("task4.txt");
        resultFile = FileUtils.createFile("task4UpperCase.txt");

        FileUtils.writeFile(sourceFile, "A a AA aa Aaa aAA\nAaAa    aAaA 12345");
        TaskUtils.fileToUpperCase(sourceFile, resultFile);

    }

}
