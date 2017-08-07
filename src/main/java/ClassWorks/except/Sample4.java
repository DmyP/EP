package ClassWorks.except;

import java.io.*;

public class Sample4 {
    public static void main(String[] args) {
        File f = new File("/Users/inna/IdeaProjects/EP/src/main/java/ClassWorks/except/test.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f))){
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            System.out.println("dsf");
            e.printStackTrace();
        }
    }
}

class Aaa implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }
}
