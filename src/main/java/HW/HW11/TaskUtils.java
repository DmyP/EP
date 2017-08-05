package HW.HW11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TaskUtils {

    //Task 1
    static void sortFileContents(File sourceFile, File resultFile) {
        String readedString = FileUtils.readFileToString(sourceFile);
        char[] chars = readedString.toCharArray();
        Arrays.sort(chars);
        String resultString = new String(chars);

        FileUtils.writeFile(resultFile, resultString);
    }

    //Task 2
    static void replaceWords(File sourceFile, File resultFile, String sourceWord, String destinationWord){
        String sourceString = FileUtils.readFileToString(sourceFile);
        String resultString = sourceString.replaceAll(sourceWord, destinationWord);

        FileUtils.writeFile(resultFile, resultString);
    }

    //Task 3
    static void reverseByStrings(File sourceFile, File resultFile) {
        List<String> sourceList = FileUtils.readFileToStringList(sourceFile);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : sourceList) {
            stringBuilder.append(new StringBuilder(s).reverse() + "\n");
        }

        FileUtils.writeFile(resultFile, stringBuilder.toString());
    }

    //Task 4
    static void fileToUpperCase(File sourceFile, File resultFile) {
        List<String> stringList = FileUtils.readFileToStringList(sourceFile);
        StringBuilder result = new StringBuilder();
        for (String string : stringList) {
            Matcher m = Pattern.compile("\\w{2,}").matcher(string);
            StringBuilder sb = new StringBuilder();
            int last = 0;
            while (m.find()) {
                sb.append(string.substring(last, m.start()));
                sb.append(m.group(0).toUpperCase());
                last = m.end();
            }
            sb.append(string.substring(last));
            result = result.append(sb + "\n");
        }

        FileUtils.writeFile(resultFile, result.toString());
    }

    static void surnameToUpperCase(File sourceFile, File resultFile) {
        List<String> stringList = FileUtils.readFileToStringList(sourceFile);
        StringBuilder result = new StringBuilder();
        for (String string : stringList) {
            Matcher m = Pattern.compile("\\w{2,}[ \\-:]+[1]?[7-90]").matcher(string);
            StringBuilder sb = new StringBuilder();
            int last = 0;
            while (m.find()) {
                sb.append(string.substring(last, m.start()));
                sb.append(m.group(0).toUpperCase());
                last = m.end();
            }
            sb.append(string.substring(last));
            result = result.append(sb + "\n");
        }

        FileUtils.writeFile(resultFile, result.toString());
    }

    static void determineInput(File sourceFile, File resultFile) {
        String string = FileUtils.readFileToString(sourceFile);
        List<Matcher> matcherList = new ArrayList<>();
        matcherList.add(Pattern.compile(" \\w+ ").matcher(string));
        matcherList.add(Pattern.compile(" \\p{Punct} ").matcher(string));
        matcherList.add(Pattern.compile(" \\d+ ").matcher(string));
        matcherList.add(Pattern.compile(" \\d+.\\d ").matcher(string));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext(""))
        System.out.println("Task 4. Input any letter/word/int digit/float digit\n" +
                "to find matches form source file or input empty string to leave : ");
    }
}
