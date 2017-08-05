package HW.HW11;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TaskUtils {

    //Task 1
    static void sortFileContents(File sourceFile, File destinationFile) {
        String readedString = FileUtils.readFileToString(sourceFile);
        char[] chars = readedString.toCharArray();
        Arrays.sort(chars);
        String resultString = new String(chars);

        FileUtils.writeFile(destinationFile, resultString);
    }

    //Task 2
    static void replaceWords(File sourceFile, File destinationFile, String sourceWord, String destinationWord){
        String readedString = FileUtils.readFileToString(sourceFile);
        String resultString = readedString.replaceAll(sourceWord, destinationWord);

        FileUtils.writeFile(destinationFile, resultString);
    }

    //Task 3
    static void reverseByStrings(File file, File file2) {
        List<String> sourceList = FileUtils.readFileToStringList(file);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : sourceList) {
            stringBuilder.append(new StringBuilder(s).reverse() + "\n");
        }

        FileUtils.writeFile(file2, stringBuilder.toString());
    }

    //Task 4
    static void fileToUpperCase(File file, File file2) {
        List<String> stringList = FileUtils.readFileToStringList(file);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < stringList.size(); i++) {
            Matcher m = Pattern.compile("\\b\\w{2,}\\b").matcher(stringList.get(i));
            StringBuilder sb = new StringBuilder();
            int last = 0;
            while (m.find()) {
                sb.append(stringList.get(i).substring(last, m.start()));
                sb.append(m.group(0).toUpperCase());
                last = m.end();
            }
            sb.append(stringList.get(i).substring(last));
            result = result.append(sb + "\n");
        }

        FileUtils.writeFile(file2, result.toString());
    }
}
