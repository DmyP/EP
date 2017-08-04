package ClassWorks.serialozation;

import java.io.*;

public class Main implements Serializable{
    int i = 10;
    void method(){
        System.out.println("gg");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main m = new Main();
        m.i = 222;

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/inna/IdeaProjects/EP/src/Main/java/ClassWorks/serialozation/ser.txt"));
        oos.writeObject(m);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/inna/IdeaProjects/EP/src/Main/java/ClassWorks/serialozation/ser.txt"));
        Main m2 = (Main) ois.readObject();
        ois.close();

        System.out.println(m2.i);
        m2.method();
    }
}
