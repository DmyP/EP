package HW.HW11;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CharsToUpperCase {
    void fileToUpperCase(File file, File file2) {
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
        int i = 1;
    }



}
