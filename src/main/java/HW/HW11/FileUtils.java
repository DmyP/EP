package HW.HW11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileUtils {
    static String readFileToString(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            if (!file.exists()){
                throw new FileNotFoundException(file.getName());
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    static void writeFile(File file, String string) {
        PrintWriter printWriter = null;
        try {
            if (!file.exists()){
                throw new FileNotFoundException(file.getName());
            }
            printWriter = new PrintWriter(file.getAbsoluteFile());
            printWriter.print(string);

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            printWriter.close();
        }
    }

    public static File createFile(String fileName) {
            //String path = "/Users/inna/IdeaProjects/EP/src/main/java/HW/HW11/files/" + fileName; forMacPath
            String path = "C:\\java\\EP\\src\\main\\java\\HW\\HW11\\files\\" + fileName;
            File file = new File(path);
            try {
                if(!file.exists()){
                    file.createNewFile();
                } else {
                    PrintWriter pw = new PrintWriter(file);
                    pw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return file;
    }

    static List<String> readFileToStringList(File file){
        List<String> stringList = new ArrayList<>();
        try {
            if (!file.exists()){
                throw new FileNotFoundException(file.getName());
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
