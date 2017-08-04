package HW.HW11;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

class IntSorter {

    void generateRandomInt(File file) {
        Random random = new Random();
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file.getAbsoluteFile());
            for (int i = 0; i < random.nextInt(100); i++) {
                printWriter.print(random.nextInt(9));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

    void sortFileContents(File sourceFile, File destinationFile) {
        String readedString = FileUtils.readFileToString(sourceFile);

        char[] chars = readedString.toCharArray();
        Arrays.sort(chars);
        String resultString = new String(chars);

        FileUtils.writeFile(destinationFile, resultString);
    }
}
